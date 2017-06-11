package com.learning.microservice.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.microservice.model.JobMetadata;

@Repository
public interface IMetaDataRepository extends CrudRepository<JobMetadata, Serializable>{

}
