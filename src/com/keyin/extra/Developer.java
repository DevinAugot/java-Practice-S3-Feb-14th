package com.keyin.extra;

public class Developer extends Employee implements calcBonus{

    @Override
    public double calculate() {

        return getSalary() * 0.05;
    }
}
