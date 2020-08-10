package com.javatpoint;

import java.io.IOException;
import java.util.Properties;

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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sendmail_servlet
 */
public class Sendmail_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sendmail_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String username = "mrigendrasingh752@gmail.com";
		final String password = "Baghel@1234";
//		String fromEmail = "mrigendrasingh752@gmail.com";
//		String toEmail = "mrigendrabaghel5678@gmail.com";
		
		String fromEmail=request.getParameter("fromEmail");
		String toEmail=request.getParameter("toEmail");
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username,password);
			}
		});
		//Start our mail message
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.setFrom(new InternetAddress(fromEmail));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			msg.setSubject("Subject Line");
			
			Multipart emailContent = new MimeMultipart();
			
			//Text body part
			MimeBodyPart textBodyPart = new MimeBodyPart();
			//textBodyPart.setText("My multipart text");
			String text="sending link here";
			
			String html = "Test\n" + text + "\n<a href='http://localhost:8081/ForgetPassword/forget.jsp'>Reset Password</a>";
			textBodyPart.setText(html, "UTF-8", "html");
			
//			//Attachment body part.
			MimeBodyPart pdfAttachment = new MimeBodyPart();
			
			
			try {
				pdfAttachment.attachFile("/C:/msb/Rishi/PROD.pdf");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			
			//Attach body parts
			emailContent.addBodyPart(textBodyPart);
			emailContent.addBodyPart(pdfAttachment);
			
			//Attach multipart to message
			msg.setContent(emailContent);
			//msg.setText("blabla");
			Transport.send(msg);
			System.out.println("Sent message");
			  RequestDispatcher rd=request.getRequestDispatcher("/sent.jsp");  
		        rd.forward(request, response);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	

}
