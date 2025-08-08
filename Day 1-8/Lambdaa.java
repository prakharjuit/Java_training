package wiprodemo;

public class Lambdaa {
	

public static void main(String[] args)
{
    ArithmeticOperation add = (a, b) -> a + b;


    ArithmeticOperation subtract = (a, b) -> a - b;

 
    ArithmeticOperation multiply = (a, b) -> a * b;
     

    int x = 10, y = 5;

    System.out.println("Addition: " + add.operate(x, y));       
    System.out.println("Subtraction: " + subtract.operate(x, y)); 
    System.out.println("Multiplication: " + multiply.operate(x, y));
}
}
