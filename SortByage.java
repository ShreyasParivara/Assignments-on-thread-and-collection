package com.te.hashSet;

import java.util.Comparator;

public class SortByage implements Comparator<Team>{

	@Override
	public int compare(Team o1, Team o2) {
		
		return o1.age- o2.age;
	}

	

}
