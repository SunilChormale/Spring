package com.sunil.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sunil.spring.basics.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.sunil.spring.basics.componentscan")
public class SpringComponentScanApplication {

	//We are using slf4j for the logging information to the console
	private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);
	/**
	 * Here run() method returns the applicationContext object which is managing all the BEAN's in the application.
	 * Here we are only consuming a PersonDAO beans in personDao instance
	 * and dependencies are identified using @Autowired annotation in SortAlgorithm
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringComponentScanApplication.class, args);
		
		//Here we wanted the bean of BinarySearchImpl 
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}",componentDao);
		
	}

}
