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
public class Lecturer extends Person{

    public int NPK;
    public float salary;

    public Lecturer() {
        super();
    }

    public Lecturer(String name, String email, int NPK, float salary) {
        super(name, email);
        setNPK(NPK);
        setSalary(salary);
    }

    public int getNPK() {
        return NPK;
    }

    public void setNPK(int NPK) {
        this.NPK = NPK;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
    public String addDetails(String name, String email) {
        return "Lecturer with name " + name + " and email " + email;
    }
}
