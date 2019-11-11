package main.com;

/**
 * Created with IntelliJ IDEA.
 * User: Raj
 * Date: 6/23/14
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {

    String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    public String sayHello() {

        if(this.name.isEmpty()) {
            return "Hello World";
        } else {
            return "Hello " + this.name;
        }
    }
}
