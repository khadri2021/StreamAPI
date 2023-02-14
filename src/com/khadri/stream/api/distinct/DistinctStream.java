package com.khadri.stream.api.distinct;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctStream {

	public static void main(String[] args) {

		List<Integer> listIds = new ArrayList<>();
		listIds.add(10);
		listIds.add(10);
		listIds.add(20);
		listIds.add(30);
		listIds.add(10);

		List<Integer> distinctIds = listIds.stream().distinct().collect(Collectors.toList());

		System.out.println(distinctIds);
	}
}
