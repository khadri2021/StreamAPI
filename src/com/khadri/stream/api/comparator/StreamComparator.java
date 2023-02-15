package com.khadri.stream.api.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamComparator {

	public static void main(String[] args) {

		Comparator<Integer> comp = (o1, o2) -> {
			return -o1.compareTo(o2);
		};

		TreeSet<Integer> set = new TreeSet<>();
		set.add(100);
		set.add(800);
		set.add(700);
		set.add(500);
		set.add(600);
		set.add(300);

		System.out.println("Default: " + set);

		List<Integer> newSortedSet = set.stream().sorted(comp).collect(Collectors.toList());

		System.out.println("After Sorting: " + newSortedSet);

		Optional<Integer> max = set.stream().max((o1, o2) -> o1.compareTo(o2));

		System.out.println("Max element from Sorting: " + max);

		Optional<Integer> min = set.stream().min((o1, o2) -> o1.compareTo(o2));

		System.out.println("Min element from Sorting: " + min);

	}
}
