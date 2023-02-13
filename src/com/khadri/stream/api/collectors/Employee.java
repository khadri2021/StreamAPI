package com.khadri.stream.api.collectors;

public class Employee {

	private Integer empId;

	private String empName;

	private Double salary;

	private String address;

	private String phoneNumber;

	private Integer workingDays;

	public Employee(Integer empId, String empName, Double salary, String address, String phoneNumber,
			Integer workingDays) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.workingDays = workingDays;
	}

	public Integer getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Double getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Integer getWorkingDays() {
		return workingDays;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}

	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

}
