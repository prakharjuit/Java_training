package collectionss;

import java.util.*;


class Patient {
    String id;
    String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

 

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Patient)) return false;
        Patient other = (Patient) obj;
        return id.equals(other.id);
    }


    public int hashCode() {
        return Objects.hash(id);
    }


    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class Patientt {
    public static void main(String[] args) {
        HashSet<Patient> patientSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n Patient Registry");
            System.out.println("1. Add Patient");
            System.out.println("2. Remove Patient");
            System.out.println("3. View All Patients");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();
                    Patient newPatient = new Patient(id, name);

                    boolean exists = false;
                    for (Patient pat : patientSet) {
                        if (pat.equals(newPatient)) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Patient with ID already exists.");
                    } else {
                        patientSet.add(newPatient);
                        System.out.println("Patient registered.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Patient ID to remove: ");
                    String removeId = sc.nextLine();
                    boolean removed = false;
                    for (Patient pat : patientSet) {
                        if (pat.id.equals(removeId)) {
                            patientSet.remove(pat);
                            System.out.println("Removed: " + pat.name);
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 3:
                    if (patientSet.isEmpty()) {
                        System.out.println("No patients in registry.");
                    } else {
                        System.out.println("Registered Patients:");
                        for (Patient pat : patientSet) {
                            System.out.println("• " + pat);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
