package com.sunil.spring.basics.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 1;
	}
}
