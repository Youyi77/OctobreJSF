package com.adaming.myapp;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.service.PersonneService;

import antlr.StringUtils;

@Component("ecran2Bean")
@Scope(value="session")
public class Ecran2Bean {
	@Inject
	private PersonneService personneService;
	private String prenom;
	private int compteur=-10;

	public String getNomPersonne(long id) {
		Personne personne=personneService.getPersonne(id);
		return personne.getNom();
	}
	
	public Object prenomEvent(){
		
		if (compteur==0) {
			this.prenom=this.getNomPersonne(2L);
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
		//Commentaire test Git
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
