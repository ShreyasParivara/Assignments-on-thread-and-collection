package com.te.PrinterUsingThread;

public class FirstPerson extends Thread {
	Printer printer;
	

	public FirstPerson(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		for ( int i = 0; i < 6; i++) {
			printer.print("First person printing");
		}
	

	}
}
