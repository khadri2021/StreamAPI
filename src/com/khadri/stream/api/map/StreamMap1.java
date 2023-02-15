package com.khadri.stream.api.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMap1 {

	public static void main(String[] args) {

		Student s1 = new Student(100, "JHON", "KADIRI");
		Student s2 = new Student(101, "ALLEN", "MUDIGUBBA");
		Student s3 = new Student(102, "JHON", "KADIRI");
		Student s4 = new Student(103, "ALLEN", "MUDIGUBBA");
		Student s5 = new Student(104, "ALLEN", "MUDIGUBBA");
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		Function<Student, Student> mapAddress = (std) -> {
			if (std.getStdName().equals("ALLEN")) {
				std.setStdAddress("ODC");
			}
			return std;
		};

		System.out.println("Before Stream map : " + list);
		List<Student> listModified = list.stream().map(mapAddress).collect(Collectors.toList());
		System.out.println("After Stream map : " + listModified);
	}
}
