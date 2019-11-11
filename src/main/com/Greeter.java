package main.com;


public class Greeter {
    public String getMessage(String name) {
        if (name.isEmpty())
            return "Hello, world!";
        return String.format("Hello, %s!",name);
    }
}
