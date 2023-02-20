package com.zohocrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {
@RequestMapping(value="/composeEmail", method=RequestMethod.POST)
public String composeEmail(@RequestParam("email") String email, Model model ) {
	model.addAttribute("email", email);
	return "compose_email";

}
@RequestMapping(value="/sendEmail", method=RequestMethod.POST)
public String sentEmail(@RequestParam("to") String to, @RequestParam("sub") String sub, @RequestParam("msg") String msg , Model model)
{
model.addAttribute("msg", "Email Sent");
	return "compose_email";

}
}
