package com.keyin.extra;
import java.util.Date;
/*
 * Inheritance, Interface, Enums, Polymorphism
 *
 * 1. What is their Bonus rate?
 * 2. Make employee class
 * 3. Position of the employee
 * 4. create person class
 */
public class Employee {
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public EmployeeType getType() {
        return type;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    private String name;
    private double salary;
    private EmployeeType type;

    private Date hireDate;

public double calcBonus(){
    return 0;
}

}
