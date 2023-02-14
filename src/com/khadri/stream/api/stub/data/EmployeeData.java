package com.khadri.stream.api.stub.data;

import java.util.ArrayList;
import java.util.List;

import com.khadri.stream.api.collectors.Employee;

public class EmployeeData {
	private static List<Employee> allEmployee;

	public static List<Employee> getEmployeeData() {

		allEmployee = new ArrayList<>();
		allEmployee.add(new Employee(100, "ALLEN", 100000.00, "KADIRI", "9440877300", 30));
		allEmployee.add(new Employee(111, "JHON", 200000.00, "MUDIGUBBA", "9880877300", 20));
		allEmployee.add(new Employee(120, "JHON", 200000.00, "MUDIGUBBA", "9880877300", 20));
		allEmployee.add(new Employee(150, "GABRILLA", 300000.00, "GORANTLA", "8440877300", 30));
		allEmployee.add(new Employee(140, "COSTINE", 700000.00, "ODC", "7440877300", 10));
		allEmployee.add(new Employee(170, "ALLEN", 800000.00, "KADIRI", "6440877300", 5));
		allEmployee.add(new Employee(111, "JHON", 800000.00, "KADIRI", "6440877300", 5));
		return allEmployee;

	}
}
