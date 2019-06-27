package com.j4g.cloud.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@RequestMapping("/support/contact")
public class SupportContactResource {
	
	private String contactSupport;
	
	@GetMapping(produces = "application/json")
	public ObjectNode getAPIVersion() {
		ObjectNode version = JsonNodeFactory.instance.objectNode();
		version.put("contactLinkedin", contactSupport);
		return version;
	}
	
	@Value("${config.support.contact}")
	public void setContactSupport(String contactSupport) {
		this.contactSupport = contactSupport; 
	} 

}
