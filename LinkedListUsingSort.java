package com.technoelevate.assignment.Linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class LinkedListUsingSort {

	public static void main(String[] args) {
		LinkedList <Cars> list = new LinkedList<Cars>();
		list.add(new Cars("Bugatti Chiron", 2.4, 300) );
		list.add(new Cars("Aston Martin", 3.2, 211) );
		list.add(new Cars("McLaren Senna", 2.8, 212) );
		list.add(new Cars("Ford GT", 2.9, 216) );
		list.add(new Cars("Lamborghini", 2.5, 217) );
		list.add(new Cars("Bugatti Veyron", 2.5, 253) );
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("********** compare method sort by name ***********");
		System.out.println();
		
		Collections.sort(list, new SortByName());
		
		for ( Cars x : list) {
			System.out.println(x);
		}
		
		System.out.println("**********compare to method sort by top speed********");
		System.out.println();
		Collections.sort(list);
		
		for ( Cars x : list) {
			System.out.println(x);
		}
	}

}
