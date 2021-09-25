package com.sunil.spring.basics.springbasics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		//Logic for quick sort goes here
		return numbers;
	}

}
