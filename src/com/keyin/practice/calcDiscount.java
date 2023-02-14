package com.keyin.practice;

public interface calcDiscount {

    default double calculateDiscount(){
        return 0;
    }
}
