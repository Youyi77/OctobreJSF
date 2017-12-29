package com.adaming.myapp.service;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.PersonneDAO;
import com.adaming.myapp.entities.Personne;

@Transactional(readOnly=true)
public class PersonneService {
	@Inject
	private PersonneDAO daoPersonne;
	
	public Personne getPersonne(long id){
		return daoPersonne.getPersonne(id);
	}
	
	public Personne createPersonne (Personne personne)
	{
		return daoPersonne.createPersonne(personne);
	}
	
	

	public PersonneDAO getDaoPersonne() {
		return daoPersonne;
	}

	public void setDaoPersonne(PersonneDAO daoPersonne) {
		this.daoPersonne = daoPersonne;
	}
	
	

}
