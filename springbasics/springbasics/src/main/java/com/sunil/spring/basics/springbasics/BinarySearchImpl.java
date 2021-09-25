package com.sunil.spring.basics.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Setter Injection and (No Setter and No Constructor Injection)

@Component
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
