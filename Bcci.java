package com.te.hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Bcci {

	public static void main(String[] args) {
		ArrayList<Team> arraylist = new ArrayList<Team>();
		arraylist.add(new Team("Sachin Tendulkar", 48, 10));
		arraylist.add(new Team("Mahendra Singh Dhoni", 39, 7));
		arraylist.add(new Team("Virat Kohli", 33, 18));
		arraylist.add(new Team("Rohit Sharmai", 34, 45));
		arraylist.add(new Team("Shikhar Dhawan", 36, 25));
		arraylist.add(new Team("Dinesh Karthik", 36, 21));
		arraylist.add(new Team("Ravindra Jadeja", 32, 12));
		arraylist.add(new Team("Hardik Pandya", 28, 228));
		arraylist.add(new Team("Kuldeep Yadav", 26, 23));
		arraylist.add(new Team("	Ajinkya Rahane", 33, 27));
		arraylist.add(new Team("	Jasprit Bumrah", 27, 93));
		arraylist.add(new Team("Sachin Tendulkar", 48, 10));
		if(arraylist.size() > 11)
			try {
				throw new CustomException();
			} catch (CustomException e) {
				System.out.println(e);
			}
		
		
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
