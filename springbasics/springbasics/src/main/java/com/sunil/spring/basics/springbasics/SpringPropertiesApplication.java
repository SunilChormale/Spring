package com.sunil.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.sunil.spring.basics.properties.SomeExternalProperties;

@SpringBootApplication
@ComponentScan("com.sunil.spring.basics.properties")
//Load app.properties file
@PropertySource("classpath:app.properties")
public class SpringPropertiesApplication {

	/**
	 * Here run() method returns the applicationContext object which is managing all the BEAN's in the application.
	 * Here we are only consuming a BubbleSortAlgorithm beans in BinarySearhImpl bean
	 * and dependencies are identified using @Autowired annotation in SortAlgorithm
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringPropertiesApplication.class, args);
		
		//Here we wanted the bean of BinarySearchImpl 
		SomeExternalProperties someExternalProperties = applicationContext.getBean(SomeExternalProperties.class);
		
		System.out.println(someExternalProperties);
		
		//Getting the URL here
		//i.e https://www.google.com
		System.out.println(someExternalProperties.returnServiceURL());
		
	}

}
