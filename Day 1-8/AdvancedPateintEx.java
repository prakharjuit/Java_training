package wiprodemo;
import java.util.*;
class NewPatientt
{
	String name;
	String id;
	NewPatientt(String name, String id)
	{
		this.name=name;
		this.id=id;
	}
    public void displayDetails() {
        System.out.println("ID: " + id + "\nName: " + name);
    }
	
}
public class AdvancedPateintEx {
public static void main(String [] args)
{
	LinkedList<NewPatientt> patients= new LinkedList<>();
	 Scanner sc = new Scanner(System.in);
	int choice;
	
	do
	{
		 System.out.println("\nHospital Queue System");
         System.out.println("1. Add New Patient");
         System.out.println("2. Add Emergency Patient");
         System.out.println("3. Cancel Appointment");
         System.out.println("4. View All Patients");
         System.out.println("5. View Next and Last Patient");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");
         choice=sc.nextInt();
         sc.nextLine();
         switch(choice)
         {
         case 1:
        	 System.out.println("Enter patient id to add");
        	 String idd=sc.nextLine();
        	 boolean exist=false;
        	 for(NewPatientt p:patients)
        	 {
        		 if(p.id.equals(idd))
        		 {
        			 exist=true;
        		 }
        	 }
        	 if(exist)
        	 {
        		System.out.println("Patient with id "+idd+" already exists");
        		break;
        	 }
        	 System.out.println("Enter patient name");
        	 String name1=sc.nextLine();
        	 patients.addLast(new NewPatientt(name1,idd));
        	 break;
        	 
         case 2:
        	 System.out.print("Enter patient ID: ");
             String id2 = sc.nextLine();
             boolean exists2 = false;
             for (NewPatientt p : patients) {
                 if (p.id.equals(id2)) {
                     exists2 = true;
                     break;
                 }
             }
             if (exists2) {
                 System.out.println("Patient with id "+id2+" already exists");
                 break;
             }
             System.out.print("Enter patient name: ");
             String name2 = sc.nextLine();
             patients.addFirst(new NewPatientt(id2, name2));
             System.out.println("Emergency patient added.");
             break;
             
         case 3:
        	 System.out.print("Enter patient ID to cancel: ");
             String cancelID = sc.nextLine();
             boolean removed = false;
             for (int i = 0; i < patients.size(); i++) {
                 if (patients.get(i).id.equals(cancelID)) {
                     NewPatientt removedPatient = patients.remove(i);
                     System.out.println("Appointment cancelled for " + removedPatient.name);
                     removed = true;
                     break;
                 }
             }
             if (!removed) {
                 System.out.println("No patient found with ID: " + cancelID);
             }
             break;
         case 4:
        	 if(patients.isEmpty())
        	 {
        		 System.out.println("No patients to display");
        		 break;
        	 }
        	 System.out.println("Dispalying patient queue");
        	 for(NewPatientt p:patients)
        	 {
        		 p.displayDetails();
        		 
        	 }
        	 break;
         case 5:
        	 if(patients.isEmpty())
        	 {
        		 System.out.println("No patients to display");
        		 break;
        	 }
        	 System.out.println("Next patient "+patients.getFirst());
        	 System.out.println("Last pateint "+patients.getLast());
        	 break;
        	 
         case 6:
        	 System.out.println("Exitting");
        	 break;
        default:
        	System.out.println("Invalid value");
        	break;
         }
         
		
	}while(choice!=6);
	sc.close();
}
}
