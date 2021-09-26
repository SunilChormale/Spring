package com.sunil.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sunil.spring.basics.springbasics.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringbasicsApplication {

	/**
	 * Here run() method returns the applicationContext object which is managing all the BEAN's in the application.
	 * Here we are only consuming a BubbleSortAlgorithm beans in BinarySearhImpl bean
	 * and dependencies are identified using @Autowired annotation in SortAlgorithm
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringbasicsApplication.class, args);
		
		//Here we wanted the bean of BinarySearchImpl 
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = binarySearch.binarySearch(new int[]{1,2,3}, 3);
		
		System.out.println(result);
		
	}

}
