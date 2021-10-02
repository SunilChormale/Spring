package com.sunil.spring.basics.springbasics;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunil.spring.basics.springbasics.xml.XmlPersonDAO;

@SpringBootApplication
public class SpringXmlApplication {

	/**
	 * Here run() method returns the applicationContext object which is managing all the BEAN's in the application.
	 * Here we are only consuming a BubbleSortAlgorithm beans in BinarySearhImpl bean
	 * and dependencies are identified using @Autowired annotation in SortAlgorithm
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Application Context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Here we wanted the bean of XmlPersonDAO
		XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
		
		System.out.println(personDAO);
		System.out.println(personDAO.getXmlJdbcConnection());
			
		applicationContext.close();
	}

}
