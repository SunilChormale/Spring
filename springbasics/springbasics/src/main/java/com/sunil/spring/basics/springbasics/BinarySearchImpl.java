package com.sunil.spring.basics.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Setter Injection and (No Setter and No Constructor Injection)

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

//New bean is created whenever requested.
/*
 * @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
 * New instance is created when we get the bean or request it
 * meaning: If we get the bean 100 times then we get all 100 beans different means the 100 instance of same bean are not same
 */

//By Default the scope of the spring context is singleton 
/*
 * @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
 * one instance per spring context
 * meaning: If we get the beans 100 times then we get the same object or instance
 */
public class BinarySearchImpl {
	

	@Autowired
	@Qualifier("Bubble")
	private SortAlgorithm sortAlgorithm;
	
	//Dependency Injection using ClassName as Variable name.
	/*
	 * @Autowired 
	 * private SortAlgorithm bubbleSortAlgorithm;
	 */
	
	//Constructor Injection
	/*
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm) { this.sortAlgorithm =
	 * sortAlgorithm; }
	 */
	
	//Setter Injection
	/*
	 * public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	 * this.sortAlgorithm = sortAlgorithm; }
	 */

	//In the (No Setter and No Constructor Injection) we don't need a constructor or setter function
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 1;
	}
}
