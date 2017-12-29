package com.adaming.myapp;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.service.PersonneService;

import antlr.StringUtils;

@Component("personneBean")
@Scope(value="session")
public class PersonneBean {
	@Inject
	private PersonneService personneService;
	private String prenom;
	private int compteur=0;

	public String getNomPersonne(long id) {
		Personne personne=personneService.getPersonne(id);
		return personne.getNom();
	}
	
	public Object prenomEvent(){
		
		if (prenom==null && compteur==0) {
			this.prenom=this.getNomPersonne(1L);
			compteur++;
		}
		else {
			this.prenom=String.valueOf(compteur);
			compteur++;
			
		}
		if (compteur>20) {
			double randomD = Math.random()*100;
			int random= (int) randomD;
			this.prenom=String.valueOf(random);
		}
		return this;
	}
	
	
	
	public PersonneService getPersonneService() {
		return personneService;
	}

	public void setPersonneService(PersonneService personneService) {
		this.personneService = personneService;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	public int getCompteur() {
		return compteur;
	}

	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}
	
	
}
