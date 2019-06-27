package com.j4g.cloud.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@RequestMapping("/support/contact")
public class SupportContactResource {
	
	@GetMapping(produces = "application/json")
	public ObjectNode getAPIVersion() {
		ObjectNode version = JsonNodeFactory.instance.objectNode();
		version.put("contactLinkedin", "https://www.linkedin.com/in/orlandocano/");
		return version;
	}

}
