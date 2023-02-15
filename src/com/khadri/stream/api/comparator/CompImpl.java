package com.khadri.stream.api.comparator;

import java.util.Comparator;

public class CompImpl implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return -o1.compareTo(o2);
	}

}
