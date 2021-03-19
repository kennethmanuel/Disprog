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
public class InheritanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test default base constructor
        Person p = new Person();
        System.out.println("The name is " + p.getName());
        System.out.println("The email is " + p.getEmail());
        
        // Test prameterized lecturer constructor
        System.out.println("-----------------------------\n");
        Lecturer l = new Lecturer("Ahmad", "noreply@staff.ubaya.ac.id", 4, 50000);
        System.out.println("The name is " + l.getName());
        System.out.println("The email is " + l.getEmail());
        System.out.println("The NPK is " + l.getNPK());
        System.out.println("The salary is " + l.getSalary());
        
        System.out.println("-----------------------------\n");
        String detail = p.addDetails("Person", "Person@staff.ubaya.ac.id");
        System.out.println(detail);
        
        Person p1 = new Lecturer();
        detail = p1.addDetails("Poly", "Poly@staff.ubaya.ac.id");
        System.out.println(detail);
        
        // test add detail with no parameter
        Student t = new Student("Kenneth", "s160419041@student.ubaya.ac.id", 160419041, 3.7f);
        System.out.println(t.addDetails());
        
        // test add detail with parameter
        System.out.println(t.addDetails("Kenneth", "s160419041@student.ubaya.ac.id", 160491041, 3.7f));
       
    }
    
}
