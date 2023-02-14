package com.keyin.extra;

public class Manager extends Employee implements calcBonus{


    @Override
    public double calculate() {

        return getSalary() * .10;
    }
}
