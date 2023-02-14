package com.khadri.stream.api.find;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.khadri.stream.api.collectors.Employee;

public class FindAnyandFindFirstList {

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

		Predicate<Employee> predicate = (emp) -> {
			return emp.getEmpName().equalsIgnoreCase("JHON");
		};

		Optional<Employee> optAnyEmployee = allEmployee.stream().filter(predicate).findAny();

		System.out.println(optAnyEmployee);

		Optional<Employee> optFirstEmployee = allEmployee.stream().filter(predicate).findFirst();

		System.out.println(optFirstEmployee);

		List<Employee> collect = allEmployee.stream().filter(predicate).collect(Collectors.toList());

		System.out.println(collect);

	}

}
