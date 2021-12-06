package com.te.hashSet;

public class Team implements Comparable<Team>{
	String name;
	int age;
	int jerseyNo;
	public Team(String name, int age, int jerseyNo) {
		super();
		this.name = name;
		this.age = age;
		this.jerseyNo = jerseyNo;
	}
	@Override
	public String toString() {
		return "team [name=" + name + ", age=" + age + ", jerseyNo=" + jerseyNo + "]";
	}
	@Override
	public int compareTo(Team o) {
		
		return this.jerseyNo - o.jerseyNo;
	}
	
	
	
	
	
	

}
