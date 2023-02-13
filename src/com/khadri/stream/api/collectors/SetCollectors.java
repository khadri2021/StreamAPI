package com.khadri.stream.api.collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetCollectors{

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(100);
		list.add(70);

		System.out.println("Before stream list " + list);

		Set<Integer> set = list.stream().collect(Collectors.toSet());

		System.out.println("Collected Set Data from list stream " + set);

		System.out.println("After stream list " + list);

	}
}
