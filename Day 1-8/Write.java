package wiprodemo;
import java.io.*;
public class Write {
public static void main(String[] args)
{
	BufferedWriter writer = null;
	try
	{
	writer= new BufferedWriter( new FileWriter("C:\\Users\\prakhar\\eclipse-workspace\\wipro\\text.txt",true));
	writer.write("Hello Learners");
	writer.newLine();
	System.out.println("Successfully written to file");
	}
	catch(IOException e)
	{
		System.out.println("An error occured while writing to file"+e.getMessage());
	}

}
}
