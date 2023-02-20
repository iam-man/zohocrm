package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entity.Contact;

public interface ContactService {
public void saveContact(Contact contact);

public List<Contact> listAllContacts();

public Contact getContactById(long id);
}
