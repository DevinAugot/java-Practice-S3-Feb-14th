package com.keyin.practice;

public class Furniture extends Product implements calcDiscount {

    public boolean isTuesday() {
        return isTuesday;
    }

    public void setTuesday(boolean tuesday) {

        isTuesday = tuesday;
    }
private boolean isTuesday;


    @Override

    public double calculateDiscount() {
        return getPrice() * 0.25;
    }
}
