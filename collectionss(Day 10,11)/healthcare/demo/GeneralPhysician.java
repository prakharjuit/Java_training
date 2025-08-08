package com.healthcare.demo;

public class GeneralPhysician extends Doctor {
	public GeneralPhysician(String name)
	{
		super(name);
		
	}
	public void diagnose(Patient patient)
	{
		System.out.println("Doctor:"+ name +" diagnosing "+patient.getName()+" with illness: "+patient.getIllness());
		
	}

}
