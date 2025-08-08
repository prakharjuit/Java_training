package wiprodemo;
import java.util.*;

class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }
    public void setDisease(String disease)
    {
    	this.disease=disease;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nDisease: " + disease);
    }
}

public class HospitalOPD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        patients.add(new Patient("ABC", 24, "FEVER"));
        patients.add(new Patient("XYZ", 25, "COLD"));
        patients.add(new Patient("EFG", 26, "HEADACHE"));

        int choice;

        do {
            System.out.println(" Hospital OPD Menu ");
            System.out.println("1. Add Patient");
            System.out.println("2. View patient details");
            System.out.println("3. Enter patient name to search");
            System.out.println("4. Enter patient name to update the disease");
            System.out.println("5. Show total patients");
            System.out.println("6. Remove patient by name");
            System.out.println("7. Clear all records");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();

                    boolean duplicate = false;
                    for (Patient p : patients) {
                        if (p.getName().equalsIgnoreCase(name)) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("Patient already exists with name: " + name);
                    } else {
                        System.out.print("Enter age: ");
                        int age = sc.nextInt();
                        sc.nextLine(); 

                        System.out.print("Enter disease: ");
                        String disease = sc.nextLine();

                        patients.add(new Patient(name, age, disease));
                        System.out.println("Patient added successfully.");
                    }
                    break;

                case 2:
                    if (patients.isEmpty()) {
                        System.out.println("No patients available.");
                    } else {
                        System.out.println("\nPatient List");
                        for (Patient p : patients) {
                            p.displayDetails();
                        }
                    }
                    break;
                case 3:
                	
                	System.out.println("Enter patient name to search");
                	String inputName = sc.nextLine();
                	boolean found=false;
                	for(Patient p: patients)
                	{
                        if (p.getName().equalsIgnoreCase(inputName)) {
                        	p.displayDetails();
                            found = true;
                            break;
                        }

                	}
                    if(!found)
                    {
                    	System.out.println("No patient found");
                    }
                    break;
                	
                case 4:
                	System.out.print("Enter patient name to update disease: ");
                    String updateName = sc.nextLine();
                    boolean updated = false;
                    for (Patient p : patients) {
                        if (p.getName().equalsIgnoreCase(updateName)) {
                            System.out.print("Enter new disease: ");
                            String newDisease = sc.nextLine();
                            p.setDisease(newDisease);
                            updated = true;
                            System.out.println("Disease updated successfully.");
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Patient not found.");
                    }
                    break;
                case 5:
                	System.out.println("Total number of patients: "+patients.size());
                	break;
                	
                case 6:
                	System.out.println("Enter patient name to delete");
                	String patientInput=sc.nextLine();
                	boolean removed=false;
                    for (int i = 0; i < patients.size(); i++) {
                        if (patients.get(i).getName().equalsIgnoreCase(patientInput)) {
                            patients.remove(i);
                            removed = true;
                            System.out.println("Patient removed successfully.");
                            break;
                        }
                    }
                    if(!removed)
                    {
                    	System.out.println("patient not found");
                    }
                	
                	break;
                	
                case 7:
                	System.out.println("Are you sure you want to clear all the records? 1 for yes , 2  for  no");
                	int ch= sc.nextInt();
                	sc.nextLine();
                	if(ch==1)
                	{
                		patients.clear();
                		System.out.println("All records cleared");
                		
                	}
                	else
                	{
                		System.out.println("Operation cancelled");
                	}

                case 8:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 8);
        System.out.println("Out of OPD menu");

        sc.close();
    }
}