package com.j4g.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.j4g.cloud.resources.APIVersionResource;

@SpringBootApplication
@ComponentScan(basePackageClasses = APIVersionResource.class)
public class Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}

}
