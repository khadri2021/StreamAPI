package com.khadri.stream.api.collectors;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListCollectors {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("BALLAYA");
		set.add("CHIRANJEVI");
		set.add("SUHAN");
		set.add("VIJAY DEVARAKONDA");
		set.add("SREE LEELA");
		set.add("BALLAYA");

		System.out.println("Before Stream Set: "+set);

		List<String> list = set.stream().collect(Collectors.toList());

		System.out.println("Collected list from set stream: "+list);

	}
}
