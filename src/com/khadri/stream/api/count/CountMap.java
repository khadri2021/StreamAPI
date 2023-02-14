package com.khadri.stream.api.count;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.khadri.stream.api.collectors.Employee;

public class CountMap {

	private static List<Employee> allEmployee;

	static {
		allEmployee = new ArrayList<>();
		allEmployee.add(new Employee(100, "ALLEN", 100000.00, "KADIRI", "9440877300", 30));
		allEmployee.add(new Employee(111, "JHON", 200000.00, "MUDIGUBBA", "9880877300", 20));
		allEmployee.add(new Employee(120, "JHON", 200000.00, "MUDIGUBBA", "9880877300", 20));
		allEmployee.add(new Employee(150, "GABRILLA", 300000.00, "GORANTLA", "8440877300", 30));
		allEmployee.add(new Employee(140, "COSTINE", 700000.00, "ODC", "7440877300", 10));
		allEmployee.add(new Employee(170, "ALLEN", 800000.00, "KADIRI", "6440877300", 5));
		allEmployee.add(new Employee(145, "JHON", 800000.00, "KADIRI", "6440877300", 5));
	}

	public static void main(String[] args) {

		Map<Integer, String> mapKeyValue = allEmployee.stream()
				.collect(Collectors.toMap((emp) -> emp.getEmpId(), (emp) -> emp.getAddress()));

		long count1 = mapKeyValue.keySet().stream().count();
		System.out.println("All Keys count " + count1);

		long count2 = mapKeyValue.values().stream().filter((add) -> add.equals("MUDIGUBBA")).count();
		System.out.println("Mudigubba Address Count : " + count2);
	}

}
