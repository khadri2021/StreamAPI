package com.khadri.stream.api.match;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.khadri.stream.api.collectors.Employee;

public class MatchAnyOrMatchAll {
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

		Predicate<Employee> allMatchPredicate = (emp) -> {

			return emp.getWorkingDays() > 5;

		};
		boolean isAllMatch = allEmployee.stream().allMatch(allMatchPredicate);

		if (isAllMatch) {
			System.out.println("All are matched");
		} else {
			System.out.println("No All Match Found");
		}

		boolean isAnyMatch = allEmployee.stream().anyMatch(allMatchPredicate);

		if (isAnyMatch) {
			System.out.println("Some Match Found");
		} else {
			System.out.println("No Match Found");
		}

	}

}
