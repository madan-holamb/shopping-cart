package com.osc.email.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailController {
	
	/*@Autowired
	MailService mailService;
	
	@PostMapping("/send/{mail}")
	public String sendMail(@PathVariable String mail,@RequestBody MailStructure mailStructure) {
		mailService.sendMail(mail, mailStructure);
		
		return "=====Mail Sent Successfully=====";
	}
	*/

}
