package wiprodemo;
import java.util.*;
public class WrappClassEx2 {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
    System.out.print("Enter age: ");
    String ageInput = sc.nextLine();

    System.out.print("Enter salary: ");
    String salaryInput = sc.nextLine();

   
    int age = Integer.parseInt(ageInput);
    int salary = Integer.parseInt(salaryInput);

 
    System.out.println("Converted Age: " + age);
    System.out.println("Converted Salary: " + salary);

    sc.close();
}
}
