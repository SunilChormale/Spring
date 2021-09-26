package com.sunil.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sunil.spring.basics.springbasics.scope.PersonDAO;

@SpringBootApplication
public class SpringScopeApplication {

	//We are using slf4j for the logging information to the console
	private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);
	/**
	 * Here run() method returns the applicationContext object which is managing all the BEAN's in the application.
	 * Here we are only consuming a PersonDAO beans in personDao instance
	 * and dependencies are identified using @Autowired annotation in SortAlgorithm
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringScopeApplication.class, args);
		
		//Here we wanted the bean of BinarySearchImpl 
		PersonDAO personDao1 = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}",personDao1);
		LOGGER.info("{}",personDao1.getJdbcConnection());
		
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
		
	}

}
