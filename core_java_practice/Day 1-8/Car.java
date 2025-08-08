package wiprodemo;

public class Car implements Vehicle {
	
	public void start()
	{
		System.out.println("engine starts");
		
	}
	public void stop()
	{
		System.out.println("engine stops");
	}
	
	public static void main(String[] args)
	{
		Car c= new Car();
		c.start();
		c.stop();
	}

}
