package com.xworkz.inheritance.thing.Child;

import com.xworkz.inheritance.thing.parent.Doctor;

public class Cardiologist extends Doctor{
	public String cardiologist;
	public String week;
	

	public void cardiologistp(Cardiologist cord)
	{
		System.out.println("Cardiologist Naditha ede");

		System.out.println(cord.cardiologist );
		System.out.println(cord.week);
		System.out.println(cord.name);
		System.out.println(cord.specilist );
		System.out.println(cord.gender);

}
}
