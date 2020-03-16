package com.fdmgroup.tradingplatform.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fdmgroup.tradingplatform.model.Broker;

public class BrokerDao extends GenericDao<Broker> {

	private static Logger log = LogManager.getLogger();

	private EntityManager em;

	public BrokerDao(EntityManagerFactory emf) {
		super(emf);
	}

	@Override
	public boolean add(Broker t) {
		em = getEmf().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(t);
			em.getTransaction().commit();
		} catch (RollbackException e){
			log.error("Error: Unable to add new Broker", e);
		} finally {
			em.close();
		}
		log.info("New Broker has been added");
		return true;	}

	@Override
	public Broker get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Broker t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Broker> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
