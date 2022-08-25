package com.tut;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="employee")
public class Employee {

    @Id
    @GeneratedValue
    Integer id;
    String name;
    Integer age;
    String language;

    // Setters and Getters


    Employee()
    {

    }
    public Employee(String name, Integer age, String language) {
        this.name = name;
        this.age = age;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nName :"+getName());
        sb.append("\nAge :"+getAge());
        sb.append("\nLanguage : "+getLanguage());
        sb.append("\nID : "+getId());
        return sb.toString();
    }
}
