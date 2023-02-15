package com.khadri.stream.api.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMap2 {

	public static void main(String[] args) {

		Phone p1 = new Phone(new Sim("9440877300", "VODAFONE"));
		Phone p2 = new Phone(new Sim("9440877301", "AIRTEL"));
		Phone p3 = new Phone(new Sim("9440877302", "JIO"));
		Phone p4 = new Phone(new Sim("9440877303", "JIO"));

		List<Phone> list = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));

		Function<Phone, Phone5G> convert5G = (phone) -> {
			return new Phone5G(phone.getSim());
		};

		List<Phone5G> new5GPhone = list.stream().map(convert5G).collect(Collectors.toList());

		new5GPhone.stream().forEach((phone5G) -> {
			System.out.println(phone5G.getSim().getNumber() + " - " + phone5G.getSim().getOperator());
		});

	}
}
