package test.unit;

import main.HelloWorld;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

public class HelloWorldTest {

    @Test
    public void itSaysHelloWorld() {
        HelloWorld testSubject = new HelloWorld();
        Assert.assertEquals("Hello World", testSubject.getMessage());
    }

    @Test
    public void itCustomizesGreetingForLoggedInUser() {
        HelloWorld testSubject = spy(new HelloWorld());
        doReturn("Raj").when(testSubject).getLoggedInUser();
        Assert.assertEquals("Hello Raj", testSubject.getMessage());
    }
}
