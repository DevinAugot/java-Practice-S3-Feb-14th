package com.keyin.extra;

public class DevOps extends Employee implements calcBonus{
    @Override
    public double calculate() {

        return  getSalary() * .07;
    }
}
