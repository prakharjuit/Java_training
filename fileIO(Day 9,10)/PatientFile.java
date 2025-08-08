package wiprodemo;
import java.util.*;
import java.io.*;

public class PatientFile {
public static void main(String [] args)
{
	Scanner sc= new Scanner(System.in);
	int choice;
	do
	{
	     System.out.println("\n1. Add Patient");
         System.out.println("2. View Patients");
         System.out.println("3. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();
         sc.nextLine();
         switch (choice) {
         case 1:
             addPatient(sc);
             break;
         case 2:
             viewPatients();
             break;
         case 3:
             System.out.println("Exiting...");
             break;
         default:
             System.out.println("Invalid option.");
     }

 } while (choice != 3);

 sc.close();
}

static void addPatient(Scanner sc) {
 try {BufferedWriter fw = new BufferedWriter(new FileWriter("Patients.pdf", true)) ;
     System.out.print("Enter ID: ");
     int id = sc.nextInt();
     sc.nextLine();

     System.out.print("Enter Name: ");
     String name = sc.nextLine();

     System.out.print("Enter Disease: ");
     String disease = sc.nextLine();

     System.out.print("Enter Age: ");
     int age = sc.nextInt();
     sc.nextLine();

     fw.write(id + "," + name + "," + disease + "," + age + "\n");
     System.out.println("Patient added.");
     fw.close();
 } catch (IOException e) {
     System.out.println("Error writing file: " + e.getMessage());
 }
}

static void viewPatients() {
 try {BufferedReader br = new BufferedReader(new FileReader("Patients.pdf"));
     String line;
     System.out.println("\n--- Patient Records ---");
     while ((line = br.readLine())!=null) {
         System.out.println(line);
     }
     br.close();
 } catch (FileNotFoundException e) {
     System.out.println("No patient records yet.");
 } catch (IOException e) {
     System.out.println("Error reading file: " + e.getMessage());
 }
}
}