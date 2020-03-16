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

public class UserDao extends GenericDao<Shareholder>{
	
	private static Logger log = LogManager.getLogger();
	
	private EntityManager em;
	
	public UserDao(EntityManagerFactory emf) {
		super(emf);
	}

	@Override
	public boolean add(Shareholder t) {
		log.info("Attmepting to add new User");
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
		log.info("Attempting to retrieve User");
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
		log.info("Attempting to udpate User");
		em = getEmf().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(t);
			em.getTransaction().commit();
		} catch (RollbackException e) {
			log.error("Error: Unable to update User", e);
		} finally {
			em.close();
		}
		log.info("User has been updated");
		return true;
	}

	@Override
	public boolean remove(int id) {
		log.info("Attempting to udpate User");
		em = getEmf().createEntityManager();
		Shareholder shareholder = em.find(Shareholder.class, id);
		try {
			em.getTransaction().begin();
			em.remove(shareholder);
			em.getTransaction().commit();
		} catch (NoResultException e) {
			log.error("Error: Unable to remove User", e);
		} finally {
			em.close();
		}
		log.info("User has been updated");
		return true;
	}

	@Override
	public List<Shareholder> list() {
		log.info("Attempting to retrieve list of User");
		List<Shareholder> list = null;
		em = getEmf().createEntityManager();
		try {
			TypedQuery<Shareholder> query = em.createNamedQuery("userFindAll", Shareholder.class);
			list = query.getResultList();
		} catch (NoResultException e) {
			log.error("Error: Unable to retrieve list of users");
			e.printStackTrace();
		} finally {
			em.close();
		}
		log.info("User List has been retrieved");
		return list;
	}

	public Shareholder findByEmail(String email) {
		log.info("Attempting to find User by email");
		em = getEmf().createEntityManager();
		Shareholder shareholder = null;
		try {
			TypedQuery<Shareholder> query = em.createNamedQuery("findByEmail", Shareholder.class);
			query.setParameter("email", email);
			shareholder = query.getSingleResult();
		} catch (NoResultException e) {
			log.error("Error: Unable to find User by email", e);
		} finally {
			em.close();
		}
		log.info("User has been retrieved by email");
		return shareholder;
	}
}
