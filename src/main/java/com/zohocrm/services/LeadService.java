package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entity.Lead;

public interface LeadService {
public void saveOneLead(Lead lead);
public Lead findById(long id);
public void deleteById(long id);
public List<Lead> getallLeads();
}
