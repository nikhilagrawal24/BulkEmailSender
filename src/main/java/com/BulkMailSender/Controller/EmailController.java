package com.BulkMailSender.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BulkMailSender.Model.EmailDetails;
import com.BulkMailSender.Service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	   @PostMapping("/sendMail")
	    public void sendMail(@RequestBody EmailDetails email)
	    {
	        emailService.sendEmail(email);
	        System.out.println("Data sent");
	    }
}
