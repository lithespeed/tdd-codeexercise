package main.com.bankapp;

public interface EmailService {

    public void sendEmail(String from, String to, String subject, String body);
}
