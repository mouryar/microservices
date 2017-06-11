package com.learning.microservice.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservice.model.JobMetadata;
import com.learning.microservice.service.ServiceFactory;

@RestController
@RequestMapping("/api/v1")
public class MetadataController {

	@Autowired
	private ServiceFactory serviceFactory;

	@RequestMapping(value = "/metadata", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getMetaData() {
		return new ResponseEntity<Object>(serviceFactory.getMetaDataService().getAllJobs(), HttpStatus.OK);
	}

	@RequestMapping(value = "/metadata/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getMetaData(@PathVariable int id) {
		return new ResponseEntity<Object>(serviceFactory.getMetaDataService().getJobMetaData(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/metadata", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateMetaData(@Valid @RequestBody JobMetadata metaData) {
		return new ResponseEntity<Object>(serviceFactory.getMetaDataService().updateJobMetaData(metaData),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/metadata/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteMetaData(@PathVariable int id) {
		serviceFactory.getMetaDataService().deleteJobMetaData(id);
		return new ResponseEntity<Object>(new Boolean(true), HttpStatus.OK);
	}
}
