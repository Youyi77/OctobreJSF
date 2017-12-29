package com.adaming.myapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.adaming.myapp.entities.Carte;

public class CarteDao {
	private EntityManager entityManager;
	
	public Carte createCarte(Carte carte){
		entityManager.persist(carte);
		return carte;
	}
	
	public Carte getCarte(int idCarte){
		Query query=entityManager.createQuery("from Carte where id=?", Carte.class).setParameter(0, idCarte);
		return (Carte) query.getSingleResult();
	}
	
	public List<Carte> getAllCarte(){
		Query query = entityManager.createQuery("from Carte", Carte.class);
		List<Carte> cartes = query.getResultList();
		return cartes;
	}

}
