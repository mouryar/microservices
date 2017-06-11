package com.learning.microservice.service;


import org.springframework.stereotype.Service;

import com.learning.microservice.model.JobMetadata;

@Service
public interface IMetaDataService {
	
	public Iterable<JobMetadata> getAllJobs();
	public JobMetadata getJobMetaData(int id);
	public JobMetadata updateJobMetaData(JobMetadata jobMetaData);
	public void deleteJobMetaData(int id);
	
}
