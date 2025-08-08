package wiprodemo;

public class classs {
	 String name;
	    String id;
	    String department;
	    double salary;

	    void setDetails(String n, String i, String d, double s) {
	        name = n;
	        id = i;
	        department = d;
	        salary = s;
	    }

	    void displayDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: ₹" + salary);
	    }
	
public static void main(String [] args)
{
	 classs emp = new classs();
     emp.setDetails("Prakhar", "EMP101", "IT", 50000);
     emp.displayDetails();
	
}
}
