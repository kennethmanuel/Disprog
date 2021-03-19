/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author kenne
 */
public class Person {

    private String name;
    private String email;

    public Person() {
        setName("Kenneth");
        setEmail("aokwokawo@ubaya.ac.id");
    }

    public Person(String name, String email) {
        setName(name);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String addDetails(String name, String email) {
        return "Name: " + name + " and Email: " + email;
    }
}
