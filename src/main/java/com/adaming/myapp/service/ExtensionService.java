package com.adaming.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.ExtensionDao;
import com.adaming.myapp.entities.Extension;

@Transactional(readOnly=true)
public class ExtensionService {
	@Autowired
	private ExtensionDao extensionDao;
	
	public Extension createExtension(Extension extension) {
		return extensionDao.createExtension(extension);
	}
	
	public Extension getExtension(int idExtension) {
		return extensionDao.getExtention(idExtension);
	}

}
