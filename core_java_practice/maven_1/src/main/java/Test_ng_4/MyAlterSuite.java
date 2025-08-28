package Test_ng_4;

import java.util.ArrayList;
import java.util.List;

import org.testng.IAlterSuiteListener;
import org.testng.xml.*;

public class MyAlterSuite implements IAlterSuiteListener{

	@Override
	public void alter(List<XmlSuite> suites)
	{
		System.out.println("inside alter() modifiying suite programaticaly");
		XmlSuite suite=suites.get(0);
		XmlTest test = new XmlTest(suite);
		test.setName("Dynamic");
		List<XmlClass> classes= new ArrayList<>();
		classes.add(new XmlClass("Test_ng_4.TestClass"));
		classes.add(new XmlClass("Test_ng_4.TestClassTwo"));
		test.setXmlClasses(classes);
	}
	
}
