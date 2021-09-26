package com.sunil.spring.basics.springbasics.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		//Logic for quick sort goes here
		return numbers;
	}

}
