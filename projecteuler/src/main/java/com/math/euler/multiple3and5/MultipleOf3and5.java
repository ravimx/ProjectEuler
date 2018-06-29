package com.math.euler.multiple3and5;

import java.util.stream.IntStream;

public class MultipleOf3and5 {

	public static void main(String[] args) {
		IntStream infiniteStream = IntStream.iterate(0, i -> i + 1);
		int sum = infiniteStream.limit(1000).filter(e -> (e % 3 == 0 || e % 5 == 0 )).sum();
		System.out.println(sum);
	}

}
