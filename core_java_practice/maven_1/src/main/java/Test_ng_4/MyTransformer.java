package Test_ng_4;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyTransformer implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation,
                          Class testClass,
                          Constructor testConstructor,
                          Method testMethod) {
        // apply only to the method named "invoke"
        if (testMethod.getName().equals("testTransformer")) {
            annotation.setInvocationCount(3);  // run 3 times
        }
    }
}
