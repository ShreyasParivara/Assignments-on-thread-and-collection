package com.technoelevate.assignment.Linkedlist;

import java.util.Comparator;

public class SortByName implements Comparator<Cars> {

	public static void main(String[] args) {

	}

	@Override
	public int compare(Cars o1, Cars o2) {

		return o1.name.compareTo(o2.name);
	}
	

}
