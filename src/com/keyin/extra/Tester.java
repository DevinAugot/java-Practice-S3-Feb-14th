package com.keyin.extra;

public class Tester extends Employee implements calcBonus{
    @Override
    public double calculate() {

        return getSalary() * 0.03;
    }
}
