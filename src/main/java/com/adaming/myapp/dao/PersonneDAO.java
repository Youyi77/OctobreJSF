package com.adaming.myapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Personne;

public class PersonneDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Personne getPersonne(long id) {
		Query query=entityManager.createQuery("from Personne where id=?", Personne.class);
		query.setParameter(1, id);
		return (Personne) query.getSingleResult();
		
	}
	
	public Personne createPersonne(Personne personne) {
		entityManager.persist(personne);
		return  personne;	
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	

}
