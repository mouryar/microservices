package com.learning.microservice.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ServiceFactory {

	@Autowired
	@Named("metadata")
	private IMetaDataService metaDataService;
	
	public IMetaDataService getMetaDataService()
	{
		return metaDataService;
	}
}
