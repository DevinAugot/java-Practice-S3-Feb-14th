package com.keyin.practice;
import java.time.LocalDate;
import java.util.Date;

public class Product {

    public ProductTypes getType() {
        return type;
    }

    public void setType(ProductTypes type) {
        this.type = type;
    }

    private ProductTypes type;

    public String day;
    public double getPrice() {
        return price;
    }

    public double price;
    public String getProdName() {
        return prodName;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }



    public String getLocation() {
        return location;
    }



    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getInStock() {
        return inStock;
    }

    public String setInStock(String inStock) {
        this.inStock = inStock;
        return inStock;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /*
     * 1. product class (name, manufacture date, expiry date, location, in stock? boolean value )
     * 2. method for discount
     * */
    public String prodName;

    public LocalDate manufactureDate;

    public Date expiryDate;

    public String inStock;
    public String location;



}
