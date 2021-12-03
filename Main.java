package com.te.PrinterUsingThread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Printer printer = new Printer();
		FirstPerson firstperson = new FirstPerson(printer);
		SecondPerson secondperson = new SecondPerson(printer);
		
		firstperson.start();
		secondperson.start();
		firstperson.join();
		secondperson.join();
		
		

	}

}
