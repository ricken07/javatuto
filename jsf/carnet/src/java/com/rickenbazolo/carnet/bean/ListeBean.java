/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rickenbazolo.carnet.bean;

import com.rickenbazolo.carnet.model.Contact;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Ricken BAZOLO
 */
@Named
@RequestScoped
public class ListeBean {

    @Inject
    private ContactBean bean;
    private List<Contact> all;

    public ListeBean() {
    }

    public List<Contact> getAll() {
        return bean.getContacts();
    }

}
