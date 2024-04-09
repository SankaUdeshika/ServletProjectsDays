/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author sanka
 */
public class User {
    private String name;
    private String contact;
    private String email;
    private String passoword;
    
    
    public User(String name,String contact,String email,String password){
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.passoword = password;
    }

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the passoword
     */
    public String getPassoword() {
        return passoword;
    }

    /**
     * @param passoword the passoword to set
     */
    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }
    
}
