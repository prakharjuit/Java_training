package wiprodemo;

public class Employee {
	int id;
	String name;
	public Employee()
	{
		this.id=1;
		this.name="ABC";
	}
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public Employee(Employee emp)
	{
		this.id=emp.id;
		this.name=emp.name;
	}
	public void display()
	{
		System.out.println("Employee details\n");
		System.out.println("id:"+id+" name:"+name);
		
	}
   public static void main(String [] args)
   {
	   Employee e1 = new Employee(1,"Prakhar");
	   e1.display();
	   Employee e3= new Employee();
	   e3.display();
	   Employee e2= new Employee(e1);
	   e2.display();
	   

   }
}
