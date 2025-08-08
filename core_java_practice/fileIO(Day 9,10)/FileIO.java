package wiprodemo;
import java.io.*;

public class FileIO {
public static void main(String[] args)
{
	BufferedReader reader = null;
	try {
	reader =new BufferedReader (new FileReader("C:\\Users\\prakhar\\eclipse-workspace\\wipro\\text.txt"));
	String line;
	while((line=reader.readLine())!=null)
	{
		System.out.println(line);
	}
	}
	catch(FileNotFoundException e)
	{
		System.out.println("File not found"+ e.getMessage());
	}
	catch(IOException e)
	{
		System.out.println("An i/o error "+e.getMessage());
	}
	finally
	{
		try {
			if(reader!=null)
			{
				reader.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("Error message"+e.getMessage());
		}
	}
	
}
}
