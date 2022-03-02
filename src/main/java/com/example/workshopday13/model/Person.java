package com.example.workshopday13.model;

import java.io.Serializable;

public class Person implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;
    private Character gender;

    public Person(){};
    
    public Integer getId(){
        return id;
    }

    public void setId(Integer _id){
        this.id = _id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public Character getGender(){
        return gender;
    }

    public void setGender(Character gender){
        this.gender = gender;
    }

}
