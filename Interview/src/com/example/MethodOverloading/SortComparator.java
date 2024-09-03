package com.example.MethodOverloading;

import java.util.Comparator;

public class SortComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getSal().compareTo(o1.getSal());
	}

}
