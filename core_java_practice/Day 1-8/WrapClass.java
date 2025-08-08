package wiprodemo;
import java.util.*;
class Student
{
	ArrayList<Integer> marks= new ArrayList<>();
	String name;
	int total=0;
	Student(String name)
	{
		this.name=name;
	}
	void addMark(int mark)
	{
		marks.add(mark);
		total+=mark;
	}
	void display()
	{
		System.out.println("Student Details:");
		System.out.println("Student Name: "+this.name);
        System.out.println("Marks: "+marks);
        System.out.println("Total Marks: "+total);
        
	}
}
public class WrapClass {
public static void main(String []args)
{
//	int num=10;
	//Integer obj=num;
//	Integer obj1=Integer.valueOf(num);
//String str="Prakhar";
Scanner sc = new Scanner(System.in);
//ArrayList<Integer> arr = new ArrayList<>();
//
//
//System.out.println("Enter the values in array");
//for (int i = 0; i < 5; i++) {
//    System.out.print("Enter value for index " + i + ": ");
//    int num = sc.nextInt(); 
//    arr.add(num);  
//}
//
//System.out.println("\nFinal ArrayList:");
//for (int i = 0; i < arr.size(); i++) {
//    System.out.println("Index " + i + " : " + arr.get(i));
	


Student s1 = new Student("ABC");
ArrayList<Student> studentss = new ArrayList<>();
System.out.print("Enter number of students: ");
int students = sc.nextInt();
for(int i=0;i<students;i++)
{
    sc.nextLine(); 
    System.out.print("Enter name of student " + (i + 1) + ": ");
    String name = sc.nextLine();

    Student student = new Student(name);
	System.out.print("Enter number of subjects: ");
	int subjects = sc.nextInt();
	for(int j=0;j<subjects;j++)
	{
	    System.out.println("Enter marks for subject " + (j+ 1) + ": ");
	    int mark = sc.nextInt();
		student.addMark(mark);
		
	}
	studentss.add(student);
}
System.out.println("\nStudents Report");
for (Student s : studentss) {
    s.display();
}



	
}
}
