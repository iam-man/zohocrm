package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zohocrm.entity.Lead;
import com.zohocrm.repository.LeadRepository;
@Component
public class LeadServiceImpl implements LeadService {
@Autowired
private LeadRepository leadRepo;
	@Override
	public void saveOneLead(Lead lead) {
leadRepo.save(lead);
	}
	@Override
	public Lead findById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
	}
	@Override
	public List<Lead> getallLeads() {
         List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
