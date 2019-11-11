package main.com.bankapp;

/**
 * Created by raj_indugula on 3/1/17.
 */
public interface EmailService {

    public void sendEmail(String from, String to, String subject, String body);
}
