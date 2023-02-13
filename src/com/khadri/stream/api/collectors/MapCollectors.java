package com.khadri.stream.api.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapCollectors {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "JHON");

		Employee e2 = new Employee(300, "COSTINE");

		Employee e3 = new Employee(200, "ALLEN");

		List<Employee> list = new ArrayList<>();

		list.add(e1);
		list.add(e2);
		list.add(e3);

		System.out.println("Before stream list : " + list);

		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap((emp) -> emp.getEmpId(), (emp) -> emp.getEmpName()));

		System.out.println("Collected map from list stream: " + map);
	}
}
