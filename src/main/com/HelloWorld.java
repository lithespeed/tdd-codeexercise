package main.com;

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
