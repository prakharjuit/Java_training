package wiprodemo;
import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Appointment
{
	String name;
	LocalTime time;
	Appointment(String name, LocalTime time)
	{
		this.name=name;
		this.time=time;
	}
	public String toString()
	{
		return "Patient:" + name + " ,Time: "+time;
	}
	
}
public class PatientTreeMap {
public static void main(String[] args)
{
	TreeMap<Integer,Appointment> patients=new TreeMap<>();
	Scanner sc = new Scanner(System.in);
	DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
	int choice ;
	 do
	 {
		 System.out.println("Patient Appointment Scheduler Menu");
		 System.out.println("1. Add patient");
		 System.out.println("2. View All Appointments");
         System.out.println("3. Remove Appointment");
         System.out.println("4. Reschedule Appointment");
         System.out.println("5. View Next and Last Appointment");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();
         switch(choice)
         {
        	 case 1:
        		 System.out.println("Enter Appointment id ");
        		 int id= sc.nextInt();
        		 sc.nextLine();

        		 if(patients.containsKey(id))
        		 {
        			 System.out.println("Patient Already Registered wiht the same id");
        			 break;
        		 }
        		 else
        		 {
            		 System.out.println("Enter patient name: ");
            		 String name= sc.nextLine();
            		 System.out.println("Enter appointment timing: ");
            		 String time1=sc.nextLine();
            		 LocalTime time = LocalTime.parse(time1, timeFormatter);
        		 patients.put(id, new Appointment(name,time));
        		 System.out.println("Appointment scheduled");
        		 break;
        		 }
        	 case 2:
        		 if (patients.isEmpty()) {
                     System.out.println("No appointments scheduled.");
                 } else {
                     System.out.println("\nScheduled Appointments:");
                     for (Map.Entry<Integer, Appointment> entry : patients.entrySet()) {
                         System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
                     }
                 }
                 break;
        	 case 3:
        		 if(patients.isEmpty())
        		 {
        			 System.out.println("Patient queue is empty");
        		 }
        		 else
        		 {
        			 System.out.println("Enter id to remove apppointment: ");
        			 int id1 =sc.nextInt();
        			 patients.remove(id1);
        		 }
        		 break;
        	 case 4:
        		 System.out.print("Enter Existing Appointment ID to reschedule: ");
                 int oldId = sc.nextInt();
                 sc.nextLine();
                 if (patients.containsKey(oldId)) {
                	 System.out.print("Enter New Time: ");
                     String newTime = sc.nextLine();
                     LocalTime time = LocalTime.parse(newTime, timeFormatter);
                     
                     Appointment appt = patients.get(oldId);
                     appt.time = time;
                     System.out.println("Appointment time updated.");
                 }
                 else
                 {
                	 System.out.println("Patient doesn't exists");
                 }
                 break;
        	 case 5:
        		 if(patients.isEmpty())
        		 {
        			 System.out.println("No patients to display");
        		 }
        		 else {
        			 int nextKey= patients.firstKey();
        			 int lastKey= patients.lastKey();        	    
        			 System.out.println("Next patient, "+patients.get(nextKey));
        			 System.out.println("Last patient, "+patients.get(lastKey));

        		 }
        		 break;
        	 case 6:
        		 System.out.println("Exitting");
        		 break;
             default:
            	 System.out.println("Invalid choice");
        			 
        		 
         }
		 
	 }while(choice!=6);
	 sc.close();
}
}
