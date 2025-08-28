package Test_ng_3;

import org.testng.annotations.Factory;

public class factory2 {
     @Factory
	 public Object[] createInstances() {
		   return new Object[] {
		  new factories("https://www.google.com"),
		  new factories("https://www.amazon.in/"),
		  new factories("https://www.instagram.com")
		    
		  };
     }
}
