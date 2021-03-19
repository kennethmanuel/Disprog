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
public class EmployeePartTime extends Employee{
    float transportCost;
    int workingDays;
    
    public EmployeePartTime(String id, String name, float salary, float transportCost, int workingDays) {
        super(id, name, salary);
        setTransportCost(transportCost);
        setWorkingDays(workingDays);
    }
    
    public float getTransportCost() {
        return transportCost;
    }
    public final void setTransportCost(float transportCost) {
        this.transportCost = transportCost;
    }
    public int getWorkingDays() {
        return workingDays;
    }
    public final void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }
    @Override
    public float getTotalSalary() {
        float totalSalary = this.getSalary() + this.getTransportCost() + 0.01f * this.getSalary() * this.getWorkingDays();
        return totalSalary;
    }
}
