package com.BulkMailSender.Service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.BulkMailSender.Model.EmailDetails;

import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(EmailDetails email) {

		try {

			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message);

			helper.setFrom(email.getFrom());
			helper.setTo(email.getTo());
			helper.setSubject(email.getSubject());

			File file = new File(email.getFile());

			MimeBodyPart mimeBodyPart = new MimeBodyPart();
			mimeBodyPart.setText(email.getText());

			MimeBodyPart mimeBodyPart2 = new MimeBodyPart();
			mimeBodyPart2.attachFile(file);

			MimeMultipart mimeMultiPart = new MimeMultipart();
			mimeMultiPart.addBodyPart(mimeBodyPart);
			mimeMultiPart.addBodyPart(mimeBodyPart2);

			message.setContent(mimeMultiPart);

			mailSender.send(message);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
