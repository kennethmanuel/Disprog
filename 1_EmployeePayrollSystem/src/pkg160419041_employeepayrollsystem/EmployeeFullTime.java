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
public class EmployeeFullTime extends Employee{
    int childrenNum;
    int workingYears;
    
    public EmployeeFullTime(String id, String name, float salary, int childrenNum, int workingYears) {
        super(id, name, salary);
        setChildrenNum(childrenNum);
        setWorkingYears(workingYears);
    }
    
    public int getChildrenNum() {
        return childrenNum;
    }
    public final void setChildrenNum(int childrenNum) {
        this.childrenNum = childrenNum;
    }
    public int getWorkingYears() {
        return workingYears;
    }
    public final void setWorkingYears(int workingYears) {
        this.workingYears = workingYears;
    }
    @Override
    public float getTotalSalary() {
        float totalSalary = this.getSalary() + 0.1f * this.getChildrenNum() + 0.01f * this.getSalary() * this.getWorkingYears();
        return totalSalary;
    }
}
