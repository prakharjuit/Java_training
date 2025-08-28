package Test_ng_3;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeneresss.class)   // <-- annotate the class, not a method
public class SampleTest {

    @Test
    public void testPass() {
        System.out.println("Executing testPass");
       // Assert.assertTrue(true);
    }

    @Test
    public void testFail() {
        System.out.println("Executing testFail");
       // Assert.fail("Intentional failure to trigger listener");
    }
}
