package com.healthcare.demo;
import java.util.HashMap;
public class PatientServiceImpl implements PatientService {
	
	    // created hashmap for storing records of patients as a key value pair 
	    // key - patient id, value- patient object 
        private HashMap<String, Patient> patientRecords= new HashMap<>();
        public void registerPatient(Patient patient)
        {
        	patientRecords.put(patient.getId(), patient);
        	System.out.println("patient Registered:"+patient.getId());
        }
        
        public void getPatientDetails(String patientId)
        {
        	Patient p = patientRecords.get(patientId);
        	if(p!=null)
        	{
        		System.out.println("Patient ID:"+p.getId());
        		System.out.println("Patient Name:"+p.getName());
        		System.out.println("Patient Illness:"+p.getIllness());
        		
        		
        		
        	}
        	else {
        	System.out.println("Patient Does Not Exists");
        }}
}
