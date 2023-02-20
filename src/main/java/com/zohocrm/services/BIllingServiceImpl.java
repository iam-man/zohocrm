package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Billing;
import com.zohocrm.repository.BillingRepository;
@Service
public class BIllingServiceImpl implements BillingService {
@Autowired
private BillingRepository billingRepo;
	@Override
	public Billing generateBill(Billing bill) {
Billing bills = billingRepo.save(bill);
return bills;
	}

}
