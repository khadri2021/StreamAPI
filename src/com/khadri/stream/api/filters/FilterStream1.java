package com.khadri.stream.api.filters;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStream1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(0);
		list.add(-1);
		list.add(1);
		list.add(-4);
		list.add(9);
		list.add(10);

		System.out.println("Before filter: " + list);

		Predicate<Integer> postivePredicate = (i) -> {

			return i >= 0;
		};

		Predicate<Integer> evenPredicate = (i) -> {

			return i % 2 == 0;
		};

		List<Integer> filteredList = list.stream().filter(postivePredicate).filter(evenPredicate)
				.collect(Collectors.toList());

		System.out.println("After filter: " + filteredList);

	}
}
