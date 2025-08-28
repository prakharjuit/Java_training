package Test_ng_2;
import org.testng.annotations.*;
public class AmazonTests {

	@Test(groups={"smoke"})
	public void testLogin()
	{
		System.out.println("Smoke:login test");
	}
	
	@Test(groups= {"regression"})
	public void addToCart()
	{
		System.out.println("Regression: add to cart");
	}
	@Test(groups= {"sanity","regression"})
	public void checkout()
	{
		System.out.println("checkout");
	}
}
