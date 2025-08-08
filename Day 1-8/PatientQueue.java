package wiprodemo;
import java.util.LinkedList;
import java.util.Scanner;

public class PatientQueue {
         public static void main(String[] args)
         {
        	 LinkedList<String> patientQueue=new LinkedList<>();
        	 Scanner sc = new Scanner(System.in);
        	 int choice ;
        	 do
        	 {
        		 System.out.println("\n Hospital Patient Queue_ _ _");
        		 System.out.println("1.Add new patient");
        		 System.out.println("2.Add emergency patient");
        		 System.out.println("3.Remove patient");
        		 System.out.println("4.View all patients");
        		 System.out.println("5. View first and last patient");
        		 System.out.println("6. Enter patient name to search");
        		 System.out.println("7.Enter patient name to remove");
        		 System.out.println("8.Clear the queue");
        		 System.out.println("9.Exit");
        		 System.out.println("Enter you choice");
        		 choice=sc.nextInt();
        		 sc.nextLine();
        		 switch(choice)
        		 {
        		 case 1:
        			 System.out.println("Enter patient name to add");
        			 String input=sc.nextLine();
        			 patientQueue.addFirst(input);
        			 System.out.println("Patient added successfully");
        			 break;
        		 case 2:
        			 System.out.println("Enter the name of patient to enter in emergency");
        			 String name=sc.nextLine();
        			 patientQueue.addLast(name);
        			 System.out.println("Patient added in emergency");
        			 break;
        		 case 3:
        			 if(patientQueue.isEmpty())
        			 {
        				 System.out.println("No patient present");
        				 
        			 }
        			 else {
        				 String removed= patientQueue.removeFirst();
        				 System.out.println("Removed patient "+removed);
        				 
        			 }
        			 break;
        		 case 4:
        			 if(patientQueue.isEmpty())
        			 {
        				 System.out.println("No patients to dispaly");
        			 }
        			 else
        			 {
        				 System.out.println("Patients:");
        				 for( String s:patientQueue)
        				 {
        					 System.out.println(s);
        				 }
        			 }
        			 break;
        		 case 5:
        			 if (patientQueue.isEmpty()) {
                         System.out.println("Queue is empty.");
                     } else {
                         System.out.println("First Patient: " + patientQueue.getFirst());
                         System.out.println("Last Patient: " + patientQueue.getLast());
                     }
                     break;
        		 case 6:
        			 System.out.println("Enter patient name to search");
        			 String inputName=sc.nextLine();
        			 if(patientQueue.contains(inputName))
        			 {
        				 System.out.println("Patient "+inputName+" present in the queue");
        			 }
        			 else
        			 {
        				 System.out.println(inputName+ " patient not present in the queue");
        			 }
        			 break;
        		 case 7:
        			 
        			 String inputName2=sc.nextLine();
        			 if(patientQueue.contains(inputName2))
        			 {
        				 patientQueue.remove(inputName2);
        				 System.out.println("Patient "+inputName2+" removed from the queue");
        			 }
        			 else
        			 {
        				 System.out.println(inputName2+ " patient not present in the queue");
        			 }
        			 break;
        			 
        		 case 8:
        			 System.out.println("Are you sure you want to clear the queue? 1 for yes , 2  for  no");
                 	int ch= sc.nextInt();
                 	sc.nextLine();
                 	if(ch==1)
                 	{
                 		patientQueue.clear();
                 		System.out.println("All records cleared");
                 		
                 	}
                 	else
                 	{
                 		System.out.println("Operation cancelled");
                 	}
                 	break;
        		 case 9:
        			 System.out.println("Exitting");
        			 break;
        		 default:
        			 System.out.println("Invalid choice!");
        			 
        			 
        			 
        		 }
        	 }while(choice!=9);
        	 sc.close();
         }
}
