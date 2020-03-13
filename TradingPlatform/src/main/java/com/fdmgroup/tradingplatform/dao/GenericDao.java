package com.fdmgroup.tradingplatform.dao;

import javax.persistence.EntityManagerFactory;

public abstract class GenericDao<T> implements IDao<T> {

	private static EntityManagerFactory emf;

	public GenericDao(EntityManagerFactory emf) {
		if (GenericDao.emf == null || !GenericDao.emf.isOpen()) {
			GenericDao.emf = emf;
		}

	}

	public static EntityManagerFactory getEmf() {
		return emf;
	}

	public static void closeEmf() {
		if (emf.isOpen()) {
			emf.close();
		}
	}
}
