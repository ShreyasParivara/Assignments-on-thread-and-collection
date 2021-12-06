package com.technoelevate.assignment.Linkedlist;

public class Cars implements Comparable<Cars> {
	String name;
	double zeroTo100;
	int topSpeed;
	public Cars(String name, double zeroTo100 , int speed) {
		super();
		this.name = name;
		this.zeroTo100 = zeroTo100;
		this.topSpeed = speed;
	}

	@Override
	public String toString() {
		return "Cars [name=" + name + ", 0 to 100 sprint time =" + zeroTo100 + " seconds " +" Top Speed=" + topSpeed + ",mph]";
	}
	
	@Override
	public int compareTo(Cars o) {
		return o.topSpeed - this.topSpeed;
	}
	
	
	

}
