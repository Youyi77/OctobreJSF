package com.adaming.myapp;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.service.PersonneService;

import antlr.StringUtils;

@Component("createPersonneBean")
@Scope(value="session")
public class CreatePersonneBean {
	@Inject
	private PersonneService personneService;
	private String prenom;
	private String nomPersonne;
	private String prenomPersonne;
	private int compteur=-10;
	private List<Personne> personnes;

	public String getNomPersonne(long id) {
		Personne personne=personneService.getPersonne(id);
		return personne.getNom();
	}
	
	public Object createEvent(){
		Personne p=new Personne("Masson", "Pauline");
		p = personneService.createPersonne(p);
		if (personnes==null){
			personnes=new ArrayList<Personne>();
		}
		personnes.add(p);
		return this;
	}	
	
	public void createPersonneEvent() {
		Personne p= new Personne();
		p.setPrenom(prenomPersonne);
		p.setNom(nomPersonne);
		p=personneService.createPersonne(p);
		if (personnes==null){
			personnes=new ArrayList<Personne>();
		}
		personnes.add(p);
	}
	
	public void hello() {
		System.out.println("Hello world");
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

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public String getNomPersonne() {
		return nomPersonne;
	}

	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	public String getPrenomPersonne() {
		return prenomPersonne;
	}

	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}
	
	
	
	
}
