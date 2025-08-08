package wiprodemo;

interface Animal
{
	void sound();
}
class Dog implements Animal
{
	public void sound()
	{
		System.out.println("barks");
		
	}
}
class Cat implements Animal
{
	public void sound()
	{
		System.out.println("meows");
		
	}
}


public class TestInterface {
     public static void main(String[] args)
     {
    	 Animal a = new Dog();
    	 a.sound();
    	 Dog d =new Dog();
    	 d.sound();
     }
}
