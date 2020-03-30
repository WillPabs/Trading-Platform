package com.fdmgroup.tradingplatform.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.RollbackException;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fdmgroup.tradingplatform.model.Shareholder;
import com.fdmgroup.tradingplatform.model.Stock;

public class StockDao extends GenericDao<Stock>{

	private static Logger log = LogManager.getLogger();
	
	private EntityManager em;
	
	public StockDao(EntityManagerFactory emf) {
		super(emf);
	}

	@Override
	public boolean add(Stock t) {
		log.info("Attmepting to add new Stock");
		em = getEmf().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(t);
			em.getTransaction().commit();
		} catch (RollbackException e){
			log.error("Error: Unable to add new Stock", e);
		} finally {
			em.close();
		}
		log.info("New Stock has been added");
		return true;
	}

	@Override
	public Stock get(int id) {
		log.info("Attempting to retrieve Stock");
		em = getEmf().createEntityManager();
		Stock stock = null;
		try {
			stock = em.find(Stock.class, id);
		} catch (NoResultException e) {
			log.error("Error: unable to retrieve Stock", e);
		} finally {
			em.close();
		}
		log.info("Stock has been retrieved");
		return stock;
	}

	@Override
	public boolean update(Stock t) {
		log.info("Attempting to udpate Stock");
		em = getEmf().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(t);
			em.getTransaction().commit();
		} catch (RollbackException e) {
			log.error("Error: Unable to update Stock", e);
		} finally {
			em.close();
		}
		log.info("Stock has been updated");
		return true;
	}

	@Override
	public boolean remove(int id) {
		log.info("Attempting to udpate Stock");
		em = getEmf().createEntityManager();
		Stock stock = em.find(Stock.class, id);
		try {
			em.getTransaction().begin();
			em.remove(stock);
			em.getTransaction().commit();
		} catch (NoResultException e) {
			log.error("Error: Unable to remove Stock", e);
		} finally {
			em.close();
		}
		log.info("Stock has been updated");
		return true;
	}

	@Override
	public List<Stock> list() {
		log.info("Attempting to retrieve list of Stock");
		List<Stock> list = null;
		em = getEmf().createEntityManager();
		try {
			TypedQuery<Stock> query = em.createNamedQuery("userFindAll", Stock.class);
			list = query.getResultList();
		} catch (NoResultException e) {
			log.error("Error: Unable to retrieve list of stocks");
			e.printStackTrace();
		} finally {
			em.close();
		}
		log.info("Stock List has been retrieved");
		return list;
	}

}
