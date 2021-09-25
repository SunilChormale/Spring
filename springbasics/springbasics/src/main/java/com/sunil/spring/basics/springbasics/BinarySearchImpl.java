package com.sunil.spring.basics.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Setter Injection and (No Setter and No Constructor Injection)

@Component
public class BinarySearchImpl {
	

	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;
	
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
		
		bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
		return 1;
	}
}
