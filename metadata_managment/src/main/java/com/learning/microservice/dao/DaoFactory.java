package com.learning.microservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoFactory {
	
	@Autowired
	private IMetaDataRepository metaDataRepository;
	
	public IMetaDataRepository getMetaDataRepository()
	{
		return null;
	}
	
}
