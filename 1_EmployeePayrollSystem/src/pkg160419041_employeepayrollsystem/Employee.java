/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg160419041_employeepayrollsystem;

/**
 *
 * @author bodyflicker
 */
// abstract means it must be inherited
public abstract class Employee {
    private String id;
    private String name;
    private float salary;
    
    public Employee(String id, String name, float salary) {
        setId(id);
        setName(name);
        setSalary(salary);
    }
    
    public String getId() {
        return id;
    }
    public final void setId(String id) {
        this.id = id;
    } 
    public String getName() {
        return name;
    }
    public final void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return salary;
    }
    public final void setSalary(float salary) {
        this.salary = salary;
    }
    public abstract float getTotalSalary();
    
}
