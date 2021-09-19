package com.sunil.spring.basics.springbasics;

public class BinarySearchImpl {

	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] result = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 1;
	}
}
