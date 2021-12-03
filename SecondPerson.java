package com.te.PrinterUsingThread;

public class SecondPerson extends Thread {
	Printer printer;
	public SecondPerson(Printer printer) {
		this.printer = printer;
	}
	
	public void run() {
		for ( int i = 0; i < 5; i++) {
			printer.print("Second person printing");
		}
	}

}
