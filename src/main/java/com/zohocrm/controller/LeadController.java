package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {
	@Autowired 
	private LeadService leadService;
	@Autowired
	private ContactService contactService;
	@RequestMapping("/createLead")
	public String viewCreatedForm() {
		return "create_lead";
	}
	@RequestMapping(value = "/saveLead" , method = RequestMethod.POST)
	public String saveLead(@ModelAttribute Lead lead, Model model)
	{
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return"lead_info";
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam ("id") long id, Model model)
	{
		Lead lead = leadService.findById(id);
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactService.saveContact(contact);
		leadService.deleteById(id);
		List<Contact> contacts = contactService.listAllContacts();
		model.addAttribute("contacts", contacts);
		return"contact_list";
	}
	@RequestMapping("/listleads")
	public String listAllLeads(Model model)
	{
		List<Lead> leads = leadService.getallLeads();
		model.addAttribute("leads", leads);
		return"list_leads";
	}
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.findById(id);
		model.addAttribute("lead", lead);
		return"lead_info";
	}
	
}