package wiprodemo;
import java.util.Scanner;
public class stringss {
public static void main(String[] args)
{
	 Scanner scanner = new Scanner(System.in);
	StringBuffer report = new StringBuffer();
	System.out.print("Enter employee name: ");
    String name = scanner.nextLine();

    System.out.print("Enter employee ID: ");
    String id = scanner.nextLine();

    System.out.print("Enter department: ");
    String department = scanner.nextLine();

    System.out.print("Enter position: ");
    String position = scanner.nextLine();

    System.out.print("Enter monthly salary: ₹");
    String salary = scanner.nextLine();


    report.append("\nEmployee Profile Report\n");
    report.append("Name       : ").append(name).append("\n");
    report.append("ID         : ").append(id).append("\n");
    report.append("Department : ").append(department).append("\n");
    report.append("Position   : ").append(position).append("\n");
    report.append("Salary     : ₹").append(salary).append(" per month\n");

    System.out.println(report.toString());
    int nameStart = report.indexOf("Name");
    int nameEnd = report.indexOf("\n", nameStart) + 1;
    report.delete(nameStart, nameEnd);
    System.out.println(report.toString());

    scanner.close();

	
}
}
