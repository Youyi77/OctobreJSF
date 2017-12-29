package com.adaming.myapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hearthstoneBean")
@Scope(value="session")
public class Hearthstone {
	private String exemple="Bonjour";
	private String nomExtension;

	public String getExemple() {
		return exemple;
	}

	public void setExemple(String exemple) {
		this.exemple = exemple;
	}

	public String getNomExtension() {
		return nomExtension;
	}

	public void setNomExtension(String nomExtension) {
		this.nomExtension = nomExtension;
	}
	
	
}
