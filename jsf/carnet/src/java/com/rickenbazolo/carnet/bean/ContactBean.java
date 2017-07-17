/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rickenbazolo.carnet.bean;

import com.rickenbazolo.carnet.model.Contact;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Ricken BAZOLO
 */
@Named
@ApplicationScoped
public class ContactBean implements Serializable {

    private List<Contact> contacts = new ArrayList<>();
    private int id = 0;

    public ContactBean() {
    }

    public void addContact(Contact contact) {
        id++;
        contact.setId(id);
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

}
