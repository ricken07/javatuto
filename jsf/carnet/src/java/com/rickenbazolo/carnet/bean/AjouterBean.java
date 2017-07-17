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

    /*private String nom;
    private String prenom;
    private String datenaiss;
    private String genre;
    private String telephone;
    private String skype;
    private String email;
    private String adresse;*/
    @Inject
    private ContactBean bean;

    public AjouterBean() {
        initFields();
    }

    public String ajouter() {
        /*System.out.println("Nom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("Date de Naissance: " + this.datenaiss);
        System.out.println("Genre: " + this.genre);
        System.out.println("Téléphone: " + this.telephone);
        System.out.println("Skype: " + this.skype);
        System.out.println("Email: " + this.email);
        System.out.println("Adresse: " + this.adresse);*/
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
        this.email = "ricken.bazolo@gmail.com";
        this.adresse = "";
    }

    /*public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDatenaiss() {
        return datenaiss;
    }

    public void setDatenaiss(String datenaiss) {
        this.datenaiss = datenaiss;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }*/


}
