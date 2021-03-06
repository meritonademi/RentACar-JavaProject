package com.example.demo.pojo.input;


import java.util.List;

public class CostumerInput {

    private String name;
    private String surname;
    private Integer age;
    private String email;
    private String phone;
    private String drln;

    public CostumerInput(String name, String surname, Integer age, String email, String phone, String drln) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.drln = drln;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDrln() {
        return drln;
    }

    public void setDrln(String drln) {
        this.drln = drln;
    }


}

