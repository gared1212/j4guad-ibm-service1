package com.j4g.cloud.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@RequestMapping("/version")
public class APIVersionResource {
	
	@GetMapping( produces = "application/json")
	public ObjectNode getAPIVersion() {
		ObjectNode version = JsonNodeFactory.instance.objectNode();
		version.put("version", "1.22.33");
		return version;      
	}

}
