package com.sunil.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbasicsApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearchImpl.binarySearch(new int[]{1,2,3}, 3);
		System.out.println(result);
		//SpringApplication.run(SpringbasicsApplication.class, args);
	}

}
