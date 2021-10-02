package com.sunil.spring.basics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalProperties {
	
	// From property file
	//Here we are fetching the value from properties file on this key : external.service.url
	@Value("${external.service.url}")
	private String URL;
	
	public String returnServiceURL() {
		return URL;
	}
}
