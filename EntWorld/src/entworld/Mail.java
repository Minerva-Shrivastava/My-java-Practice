/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entworld;

/**
 *
 * @author Minerva
 */

import java.util.Properties;
import java.util.Random;
import javax.mail.*;
import javax.mail.internet.*;

public class Mail {
    
    Mail(String useremail, String name) 
    {
        System.out.println("Sending your credentials through email");   
        /// Recipient's email ID needs to be mentioned.
      String to = useremail;//change accordingly

      // Sender's email ID needs to be mentioned
      String from = "minervasignups@gmail.com";//change accordingly
      final String username = "minervasignups@gmail.com";//change accordingly
      final String password = "Avrenim1019!";//change accordingly

      // Assuming you are sending email through relay.jangosmtp.net
      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");

      // Get the Session object.
      Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
         }
      });

      try {
         // Create a default MimeMessage object.
         Message message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse(to));

         // Set Subject: header field
         message.setSubject("Testing Subject");

         // Now set the actual message
         message.setText("Hello, this is sample for to check send "
            + "email using JavaMailAPI ");

         // Send message
         Transport.send(message);

         System.out.println("Sent message successfully....");
      }
        catch (Exception e) 
        {e.printStackTrace();}

}
}