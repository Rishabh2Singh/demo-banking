package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericDao {

	public Object save(Object obj) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		Object updatedObj=null;
		try {
			emf=Persistence.createEntityManagerFactory("test-hibernate");
			em=emf.createEntityManager();
			EntityTransaction tx=em.getTransaction();
			tx.begin();
			updatedObj=em.merge(obj);
			tx.commit();
		}catch(Exception e) {
			System.out.println("Error occurred while saving the data...");
		}finally {
			em.close();
			emf.close();
		}
		return updatedObj;		
	}
	public Object fetch(Class clazz, Object pk) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		Object obj=null;
		try {
			emf= Persistence.createEntityManagerFactory("test-hibernate");
			em=emf.createEntityManager();
			obj=em.find(clazz, pk);
		}catch(Exception e) {
			System.out.println("Error occurred while fetching the data...");
		}finally {
			em.close();
			emf.close();
		}
		return obj;
	}
	
}
