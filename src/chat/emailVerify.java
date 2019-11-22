package chat;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;

public class emailVerify {

    private String email;
    private int otp;

    public emailVerify(String email, int otp) {
        this.email = email;
        this.otp = otp;
    }

    public void sendEmail() {
        try {
            String host = "smtp.gmail.com";
            String user = "au.messenger@gmail.com";
            String passOfEmail = "Aggregor";
            String to = email;
            String from = "au.messenger@gmail.com";
            String subject = "OTP Verification for New User";
            String messageText = "Please Enter the OTP given in the mail in the form to verify the account."
                    + "\nThe OTP for the account verification is : " + otp;
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(messageText);

            Transport transport = mailSession.getTransport("smtp");
            transport.connect(host, user, passOfEmail);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            System.out.println("message send successfully");
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
