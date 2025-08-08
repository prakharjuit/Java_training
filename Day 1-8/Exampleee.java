package wiprodemo;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Scanner;

public class Exampleee {
    public static void main(String[] args) {
        LinkedList<String> patientQueue = new LinkedList<>();
        HashSet<String> patientSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Hospital Queue System");
            System.out.println("1. Add New Patient");
            System.out.println("2. Add Emergency Patient");
            System.out.println("3. Remove Patient");
            System.out.println("4. View All Patients");
            System.out.println("5. View First and Last Patient");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    if (patientSet.contains(name)) {
                        System.out.println("Patient already in queue.");
                    } else {
                        patientQueue.addLast(name);
                        patientSet.add(name);
                        System.out.println("Patient added.");
                    }
                    break;

                case 2:
                    System.out.print("Enter emergency patient name: ");
                    String emergencyName = sc.nextLine();
                    if (patientSet.contains(emergencyName)) {
                        System.out.println(" Patient already in queue.");
                    } else {
                        patientQueue.addFirst(emergencyName);
                        patientSet.add(emergencyName);
                        System.out.println("Emergency patient added.");
                    }
                    break;

                case 3:
                    System.out.print("Enter patient name to remove: ");
                    String removeName = sc.nextLine();
                    if (patientSet.contains(removeName)) {
                        patientQueue.remove(removeName);
                        patientSet.remove(removeName);
                        System.out.println("Removed: " + removeName);
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 4:
                    if (patientQueue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Current Patients:");
                        for (String p : patientQueue) {
                            System.out.println(" " + p);
                        }
                    }
                    break;

                case 5:
                    if (patientQueue.isEmpty()) {
                        System.out.println(" Queue is empty.");
                    } else {
                        System.out.println("First Patient: " + patientQueue.getFirst());
                        System.out.println("Last Patient: " + patientQueue.getLast());
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);
        sc.close();    }
}
