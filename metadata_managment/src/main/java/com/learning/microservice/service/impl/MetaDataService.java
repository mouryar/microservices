package com.learning.microservice.service.impl;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.microservice.dao.DaoFactory;
import com.learning.microservice.model.JobMetadata;
import com.learning.microservice.service.IMetaDataService;

@Named("metadata")
public class MetaDataService implements IMetaDataService{

	@Autowired
	private DaoFactory daoFactory;

	public Iterable<JobMetadata> getAllJobs() {
		return daoFactory.getMetaDataRepository().findAll();
	}

	public JobMetadata getJobMetaData(int id) {
		return daoFactory.getMetaDataRepository().findOne(id);
	}

	public JobMetadata updateJobMetaData(JobMetadata jobMetaData) {
		return daoFactory.getMetaDataRepository().save(jobMetaData);
	}

	public void deleteJobMetaData(int id) {
		daoFactory.getMetaDataRepository().delete(id);
	}
	
}
