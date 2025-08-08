package wiprodemo;
import java.util.*;
public class Treemapp {
public static void main(String[] args)
{
	TreeMap <Integer,String> patientMap=new TreeMap<>();
	patientMap.put(101, "ABC");
	patientMap.put(102, "XYZ");
	patientMap.put(104, "HIJ");
	patientMap.put(103, "EFG");

	System.out.println("Sorted patient list");
	for(Map.Entry<Integer, String>entry:patientMap.entrySet())
	{
	System.out.println("ID: "+ entry.getKey()+" -> "+ entry.getValue());
	
	}
	System.out.println("First Patient ID: "+patientMap.firstKey());
	System.out.println("Last Patient ID: "+patientMap.lastKey());
	
	System.out.println("Patient with ID 101: "+patientMap.get(101));
	
	patientMap.remove(101);
	
	System.out.println("Has ID 102? "+patientMap.containsKey(102));
	
	System.out.println("Descending Patient List :");
	NavigableMap<Integer,String> descMap= patientMap.descendingMap();
	for(Map.Entry<Integer,String> entry : descMap.entrySet())
	{
		System.out.println("ID: "+entry.getKey()+ " -> "+entry.getValue());
	}
	
}
}
