package com.healthcare.demo;
import java.util.Scanner;
public class Main {
    public static void main(String []args)
    {
    	Patient p1= new Patient("P1","ABC","Fever");
    	Patient p2= new Patient("P2","XYZ","Cough");
    	PatientService service = new PatientServiceImpl();
    	//passing object p1 and p2 as an argument to register method
    	service.registerPatient(p1);
    	service.registerPatient(p2);
    	System.out.println("\nPatient Details:");
    	//passing patient id to get details
    	service.getPatientDetails("P1");
    	// creating a doctor object 
    	GeneralPhysician d1 = new GeneralPhysician ("Doc 1","Physician");
    	// passing patient object as an argument
    	d1.diagnose(p1);
    	d1.diagnose(p2);
    	
    	// user input 
    	  Scanner sc = new Scanner(System.in);
    	  String namee,idd,ill;
    	  System.out.print("Enter Patient ID: ");
           idd = sc.nextLine();

          System.out.print("Enter Name: ");
           namee = sc.nextLine();

          System.out.print("Enter Illness: ");
          ill= sc.nextLine();

          Patient p3 = new Patient(idd, namee, ill);
          service.registerPatient(p3);
          System.out.print("Enter Patient ID to search ");
          String searchId = sc.nextLine();
          service.getPatientDetails(searchId);
          sc.close();
    	
    	
    	
    	
    }
}
