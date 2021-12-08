package com.te.arrayList;

public class DuplicateEmployeeException extends Exception {

	public DuplicateEmployeeException() {
		
		super("Employee ID cannot be duplicate");
	}
}
