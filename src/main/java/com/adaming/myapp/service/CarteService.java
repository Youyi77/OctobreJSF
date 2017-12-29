package com.adaming.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.CarteDao;
import com.adaming.myapp.entities.Carte;

@Transactional(readOnly=true)
public class CarteService {
	@Autowired
	private CarteDao carteDao;
	
	@Transactional(readOnly=false)
	public Carte createCarte(Carte carte){
		return carteDao.createCarte(carte);
	}
	
	public Carte getCarte(int idCarte) {
		return carteDao.getCarte(idCarte);
	}
	
	public List<Carte> getAllCarte() {
		return carteDao.getAllCarte();
	}

}
