package main.com.bankapp;

public interface EmailService {
    void sendEmail(String from, String to, String subject, String body);
}
