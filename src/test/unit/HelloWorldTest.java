package test.unit;


import main.com.HelloWorld;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test

    public  void itSaysHello() {

        // arrange
        HelloWorld testSubject = new HelloWorld("");

        // act
        String response = testSubject.sayHello();

        // assert
        Assert.assertEquals("Hello World", response);
    }

    @Test
    public void itDisplaysCustomizedMessage() {

        // arrange
        HelloWorld testSubject = new HelloWorld("Fool");

        // act
        String resp = testSubject.sayHello();

        // assert
        Assert.assertEquals("Hello Fool", resp);
    }
}
