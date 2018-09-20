package main;

public class HelloWorld {

    public String getMessage() {
        return (getLoggedInUser() == null) ? "Hello World" : "Hello Raj";
    }

    public String getLoggedInUser() {
        return null;
    }
}
