package wiprodemo;
import java.io.*;
import java.util.*;
class Pateint implements Serializable
{
	int id;
	String name;
	String disease;
	int age;
	public Pateint(int id,String name,String disease,int age)
	{
		this.id=id;
		this.name=name;
		this.disease=disease;
		this.age=age;
		
	}
	public String toString()
	{
		return id+ " - "+name+" - "+disease+" - "+age;
	}
}

public class Serializationn {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);

	 ArrayList<Pateint> patients = new ArrayList<>();

     System.out.print("Number of patients you want to enter? ");
     int count = sc.nextInt();
     sc.nextLine();

     for (int i = 0; i < count; i++) {
         System.out.println("\nEnter details for Patient " + (i + 1));
         System.out.print("ID: ");
         int id = sc.nextInt();
         sc.nextLine();

         System.out.print("Name: ");
         String name = sc.nextLine();

         System.out.print("Disease: ");
         String disease = sc.nextLine();

         System.out.print("Age: ");
         int age = sc.nextInt();
         sc.nextLine();

         patients.add(new Pateint(id, name, disease, age));
         
     }
     sc.close();
	try
	{
		ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("patient.det"));
		out.writeObject(patients);
		out.close();
		System.out.println("Patient saved");
		
	}
	catch(IOException e)
	{
		System.out.println("Error-"+e.getMessage());
		
	}
	try
	{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("patient.det"));
		ArrayList<Pateint> savedPatients = (ArrayList<Pateint>) in.readObject();
        System.out.println("\nSaved Patients List:");
        for (Pateint p : savedPatients) {
            System.out.println(p);
        }
        in.close();
		
	}
	catch(Exception e)
	{
		System.out.println("error reading patient");
	}
}
}
