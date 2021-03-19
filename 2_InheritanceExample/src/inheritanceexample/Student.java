/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author bodyflicker
 */
public class Student extends Person{
    
    public int NRP;
    public float IPK;
    
    public Student() {
        // super() call constructor from base class
        super();
    }
    
    public Student(String name, String email, int NRP, float IPK) {
        super(name, email);
        setNRP(NRP);
        setIPK(IPK);
    }
    
    public int getNRP() {
        return NRP;
    }
    
    public void setNRP(int NRP) {
        this.NRP = NRP;
    }
    
    public float getIPK() {
        return IPK;
    }
    
    public void setIPK(float IPK) {
        this.IPK = IPK;
    }
    
    public String addDetails(String name, String email, int NRP, float IPK) {
        return "Student with name " + name + ", email " + email + ", NRP " + NRP + ", and IPK " + IPK;
    }
    
    public String addDetails() {
        return "Student with name " + this.getName() + ", email " + this.getEmail() + ", NRP " + this.getNRP() + ", and IPK " + this.getIPK();
    }
}
