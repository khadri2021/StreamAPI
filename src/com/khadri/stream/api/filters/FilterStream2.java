package com.khadri.stream.api.filters;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.khadri.stream.api.collectors.Employee;

public class FilterStream2 {

	private static List<Employee> allEmployee;

	static {
		allEmployee = new ArrayList<>();
		allEmployee.add(new Employee(100, "ALLEN", 100000.00, "KADIRI", "9440877300", 30));
		allEmployee.add(new Employee(120, "JHON", 200000.00, "MUDIGUBBA", "9880877300", 20));
		allEmployee.add(new Employee(150, "GABRILLA", 300000.00, "GORANTLA", "8440877300", 30));
		allEmployee.add(new Employee(140, "COSTINE", 700000.00, "ODC", "7440877300", 10));
		allEmployee.add(new Employee(170, "ALLEN", 800000.00, "KADIRI", "6440877300", 5));
	}

	public static void main(String[] args) {
		Predicate<Employee> irregularEmpPredicate = (emp) -> {
			return emp.getWorkingDays() <= 20;
		};

		List<Employee> irregularEmployees = allEmployee.stream().filter(irregularEmpPredicate)
				.collect(Collectors.toList());

		System.out.println("After filter Less WorkingDays Employee List " + irregularEmployees);

		Predicate<Employee> morePkgPredicate = (emp) -> {
			return emp.getSalary() >= 500000.00;
		};

		List<Employee> terminateEmployees = irregularEmployees.stream().filter(morePkgPredicate)
				.collect(Collectors.toList());

		System.out.println("After filter Terminate Employees List : " + terminateEmployees);

	}

}
