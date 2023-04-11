package futuready.base;
import java.util.Properties;
import futuready.pages.*;
import futuready.base.*;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
public class reported_email_sending {
	baseSetup setup = new baseSetup ();
	String sending_mail_box = "agencytester11@gmail.com";
	String receive_mail_box = "agencytester22@gmail.com";
	String sending_mail_box_password = "Thang2406@";
    
	public String report_email_body (String scenario) throws Exception {
		  String title = "💽 [Automated Test Report]";
		  String test_scenario = scenario;
		  String date = setup.get_current_date();
		  String tester = "Tester :" + setup.tester_name;
		  String file_check_message = "Please checking on attachments";
		  String os = "System operation :"+System.getProperty("os.name");
		  String java = "Java version :" + System.getProperty("java.runtime.version" );
		  String full_body = title + "\n" + date + "\n"+ "Project :" + setup.project_name + "\n" + tester + "\n" + test_scenario + "\n" + os + "\n" + java + "\n" + file_check_message + 
		  "\n\n\n" + "-----------------------------" + "\n" + setup.company + "\n" + setup.tester_name + "\n" + setup.tester_mail ;  
		  return full_body;
	  }
	
	public void sending_reported_email (String subject, String body) throws Exception {
		// Create object of Property file
				Properties props = new Properties();

				// this will set host of server- you can change based on your requirement 
				props.put("mail.smtp.host", "smtp.gmx.com");

				// set the port of socket factory 
				props.put("mail.smtp.socketFactory.port", "465");

				// set socket factory
				props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

				// set the authentication to true
				props.put("mail.smtp.auth", "true");

				// set the port of SMTP server
				props.put("mail.smtp.port", "465");
				
				// This will handle the complete authentication
				Session session = Session.getDefaultInstance(props,

						new javax.mail.Authenticator() {

							protected PasswordAuthentication getPasswordAuthentication() {

							return new PasswordAuthentication("agencytester22@gmx.com", "Thang2406@");

							}

				});
				try {

					// Create object of MimeMessage class
					Message message = new MimeMessage(session);

					// Set the from address
					message.setFrom(new InternetAddress("agencytester22@gmx.com"));

					// Set the recipient address
					message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(receive_mail_box));
		            
		                        // Add the subject link
					message.setSubject(subject);

					// Create object to add multimedia type content
					BodyPart messageBodyPart1 = new MimeBodyPart();

					// Set the body of email
					messageBodyPart1.setText(body);
					
					// Create another object to add another content
					MimeBodyPart messageBodyPart2 = new MimeBodyPart();

					// Mention the file which you want to send
					String filename = setup.get_root_directory() + "\\test-output\\Default suite\\Default test.html";
					

					// Create data source and pass the filename
					DataSource source = new FileDataSource(filename);

					// set the handler
					messageBodyPart2.setDataHandler(new DataHandler(source));

					// set the file
					messageBodyPart2.setFileName(filename);

					// Create object of MimeMultipart class
					Multipart multipart = new MimeMultipart();

					// add body part 1
					multipart.addBodyPart(messageBodyPart2);

					// add body part 2
					multipart.addBodyPart(messageBodyPart1);

					// set the content
					message.setContent(multipart);

					// finally send the email
					Transport.send(message);

					System.out.println("=====Email Sent=====");

				} catch (MessagingException e) {

					throw new RuntimeException(e);

				}

			

			
	}

}
