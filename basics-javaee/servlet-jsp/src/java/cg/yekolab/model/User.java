/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cg.yekolab.model;

/**
 *
 * @author Orion WAMBERT
 */
public class User {
    //identifiant unique et obligatoire
    private int id;
    /**
     * propietes obligatoire
     */
    private String nom;
    private String prenom;
    private String genre;
    private String login;
    private String pass;

    public User() {
    }

    public User(int id, String nom, String prenom, 
            String genre, String login, String pass) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.login = login;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getNom() {
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
