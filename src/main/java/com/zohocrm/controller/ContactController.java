package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Billing;
import com.zohocrm.entity.Contact;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;


@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	@Autowired
	private BillingService billingService;
	@RequestMapping("/listAllContacts")
	public String listAllContacts(Model model)
	{
		List<Contact> contacts = contactService.listAllContacts();
		model.addAttribute("contacts", contacts);
		return"contact_list";
	}
	@RequestMapping("/createBill")
	public String createBill(@RequestParam("id") long id, Model model)
	{
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return"generate_bill";
	}
	@RequestMapping("/saveBill")
	public String saveBill(Billing bill,Model model)
	{
		Billing bills = billingService.generateBill(bill);
		model.addAttribute("bills", bills);
		return"list_bills";
	}
}
