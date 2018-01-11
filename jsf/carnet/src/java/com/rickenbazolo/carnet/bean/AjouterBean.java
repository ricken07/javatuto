/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rickenbazolo.carnet.bean;

import com.rickenbazolo.carnet.model.Contact;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Ricken BAZOLO
 */
@Named
@RequestScoped
public class AjouterBean extends Contact {

    @Inject
    private ContactBean bean;

    public AjouterBean() {
        initFields();
    }

    public String ajouter() {
        Contact contact = new Contact();
        contact.setAdresse(adresse);
        contact.setDatenaiss(datenaiss);
        contact.setEmail(email);
        contact.setGenre(genre);
        contact.setNom(nom);
        contact.setPrenom(prenom);
        contact.setSkype(skype);
        contact.setTelephone(telephone);

        bean.addContact(contact);

        initFields();

        return (null);
    }

    private void initFields() {
        this.nom = "";
        this.prenom = "";
        this.datenaiss = "";
        this.genre = "Masculin";
        this.telephone = "";
        this.skype = "";
        this.email = "";
        this.adresse = "";
    }
}
