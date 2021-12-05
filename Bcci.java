package com.te.hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Bcci {

	public static void main(String[] args) {
		LinkedHashSet<Team> linkedHs = new LinkedHashSet<Team>();
		linkedHs.add(new Team("Sachin Tendulkar", 48, 10));
		linkedHs.add(new Team("Mahendra Singh Dhoni", 39, 7));
		linkedHs.add(new Team("Virat Kohli", 33, 18));
		linkedHs.add(new Team("Rohit Sharmai", 34, 45));
		linkedHs.add(new Team("Shikhar Dhawan", 36, 25));
		linkedHs.add(new Team("Dinesh Karthik", 36, 21));
		linkedHs.add(new Team("Ravindra Jadeja", 32, 12));
		linkedHs.add(new Team("Hardik Pandya", 28, 228));
		linkedHs.add(new Team("Kuldeep Yadav", 26, 23));
		linkedHs.add(new Team("	Ajinkya Rahane", 33, 27));
		linkedHs.add(new Team("	Jasprit Bumrah", 27, 93));
		
		ArrayList<Team> arraylist = new ArrayList<>(linkedHs);
		System.out.println("********** sort by age ********");
		Collections.sort(arraylist, new SortByage());
		for(Team x:arraylist) {
			System.out.println(x);
		}
		System.out.println("*********** sort by No**********");
		Collections.sort(arraylist);
		
		for(Team x:arraylist) {
			System.out.println(x);
		}
		

	}

}
