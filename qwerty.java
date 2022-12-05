package com.xworkz.tasks;

public class qwerty extends JavaTrainee implements KarnatakaRto {
	
	@Override
	public boolean paidTax(double tax) {
		System.out.println("running paidtax");
		System.out.println(tax);
		return true;
	}

	@Override
	public double gst() {
		
		return 10000;
	}

	@Override
	public double vat() {
		
		return 78;
	}

}
