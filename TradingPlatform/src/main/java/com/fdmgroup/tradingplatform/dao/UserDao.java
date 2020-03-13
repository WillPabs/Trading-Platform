package com.fdmgroup.tradingplatform.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.RollbackException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fdmgroup.tradingplatform.model.Shareholder;

public class UserDao extends GenericDao<Shareholder>{
	
	private static Logger log = LogManager.getLogger();
	
	private EntityManager em;
	
	public UserDao(EntityManagerFactory emf) {
		super(emf);
	}

	@Override
	public boolean add(Shareholder t) {
		em = getEmf().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(t);
			em.getTransaction().commit();
		} catch (RollbackException e){
			log.error("Error: Unable to add new User", e);
		} finally {
			em.close();
		}
		log.info("New User has been added");
		return true;
	}

	@Override
	public Shareholder get(int id) {
		em = getEmf().createEntityManager();
		Shareholder shareholder = null;
		try {
			shareholder = em.find(Shareholder.class, id);
		} catch (NoResultException e) {
			log.error("Error: unable to retrieve User", e);
		} finally {
			em.close();
		}
		log.info("User has been retrieved");
		return shareholder;
	}

	@Override
	public boolean update(Shareholder t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Shareholder> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
