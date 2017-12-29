package com.adaming.myapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.adaming.myapp.entities.Extension;

public class ExtensionDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public Extension createExtension(Extension extension) {
		entityManager.persist(extension);
		
		return extension;
	}
	
	public Extension getExtention(int idExtension) {
		Extension extension = entityManager.find(Extension.class, idExtension);
		return extension;
	}

}
