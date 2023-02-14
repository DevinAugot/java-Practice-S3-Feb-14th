package com.keyin;
import java.time.LocalDate;
//
//* OOP (Object Oriented Programming)
//        * 1. Inheritance
//        * 2. Polymorphism
//        * 3. Interface
//        * 4. Abstract classes
//        * 5. Enum - are a group of constants that never change like pi = 3.124

import com.keyin.practice.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /* Inheritance examples
         * A car is a type of vehicle
         * Orange is a fruit
         * surgeon is a doctor but there are many types
         * a dog is an animal but animals have many thing in common such as 4 legs etc


         */

//        Dog sheppard = new Dog();
//
//        sheppard.name = "Lucky";
//        sheppard.display();
//        sheppard.eat();
//        sheppard.animalSound();
//
//        Cat calico = new Cat();
//        calico.name = "Pepper";
//        calico.display();
//        calico.eat();
//        calico.animalSound();
//
//        Car myCar = new Car();
//        System.out.println("\n");
//        myCar.honk();
//
//
//        // brand comes from vehicle class and the modelName comes from the car class
//        System.out.println(myCar.brand + " " + myCar.modelName);
//        System.out.println("\n");
//
//        // using the interface in the AnimalInterface.java and using all methods
//        Monkey mankey = new Monkey();
//        mankey.run();
//        mankey.animalSounds();
//        mankey.eating();
//        System.out.println("\n");
//
//        Honda motorbike = new Honda();
//        motorbike.run();
//
//        // enum example
//        Level level = Level.LOW;
//        Level pi = Level.PI;
//        Level LevelHigh = Level.HIGH;
//        Level lvlMed = Level.MEDIUM;
//        System.out.println(level);
//        System.out.println(pi);
//        System.out.println(LevelHigh);
//        System.out.println(lvlMed);

        /// employee question

//        Manager manager = new Manager();
//        manager.setName("Devin Augot");
//        manager.setSalary(150000.00);
//        manager.setType(EmployeeType.MANAGER);
//        manager.setHireDate(new Date());
//
//        System.out.println("Manager name: " + " " + manager.getName());
//        System.out.println("Manager bonus: $" + manager.calculate());
//        System.out.println("\n");
//
//        Developer developer = new Developer();
//        developer.setName("Kyle snow");
//        developer.setSalary(100000);
//        developer.setType(EmployeeType.DEVELOPER);
//        developer.setHireDate(new Date());
//
//        System.out.println("Developer name: " + " " + developer.getName());
//        System.out.println("Developer bonus: $" + developer.calculate());
//        System.out.println("\n");
//
//
//        Tester tester = new Tester();
//        tester.setName("Ken chafe");
//        tester.setSalary(80000);
//        tester.setType(EmployeeType.TESTER);
//        tester.setHireDate(new Date());
//
//        System.out.println("Tester name: " + " " + tester.getName());
//        System.out.println("Tester bonus: $" + tester.calculate());
//        System.out.println("\n");
//
//        DevOps devOps = new DevOps();
//        devOps.setName("Jordan Kelloway");
//        devOps.setSalary(120000);
//        devOps.setType(EmployeeType.DEVOPS);
//        devOps.setHireDate(new Date());
//
//        System.out.println("DevOps name: " + " " + devOps.getName());
//        System.out.println("DevOps bonus: $" + devOps.calculate());
//        System.out.println("\n");

        // write a program that shows the names of products, their prices and discount based on day of the week

        /*
        * 1. product class (name, manufacture date, expiry date, location, in stock boolean value?  )
        * 2. method for discount
        *
         * getday, getprice, getprodname, getmanufacturedate,getexpirydate, instock(boolean), getlocation
         * Meat, couch, Smart tv */

        Protein beef = new Protein();
        beef.setType(ProductTypes.FOOD);
        beef.setProdName("Ground beef");
        String day = "Tuesday";
        beef.setExpiryDate(new Date());
        beef.setTuesday(true);
        beef.setInStock("Yes");
        double regPrice = beef.setPrice(5.00);
        beef.setLocation("Walmart, Stavanger drive");
        String date = "2023-02-10";

        beef.setManufactureDate(LocalDate.parse(date));

        System.out.println("product name is: " + " " + beef.getProdName());
        System.out.println("Product type is: " + " " + beef.getType());
        System.out.println("Product price per lb is: " + "$" + beef.getPrice());
        System.out.println("product Manufacture Date is: " + " " + beef.getManufactureDate());
        if(beef.getExpiryDate() == null) {
            System.out.println("Product Expiry Date is: " + "No EXP date for product");
        }else{System.out.println("product Expiry Date is: " + " " + beef.getExpiryDate());}

        System.out.println("Product Location is:" + " " + beef.getLocation());
        System.out.println("Product in stock:" + " " + beef.getInStock());

        // if item out of stock unavailable if in stock then continue on
        // if day equals tuesday then calculateDiscount() , else regular price


        if(beef.isTuesday() && (beef.getInStock().equals("Yes"))){
            System.out.println("Price after discount is: " + (regPrice - beef.calculateDiscount()));
            System.out.println("Discount amount off food item per lb is: " + " " + (beef.calculateDiscount()) +
                    "\n");
        } else if(beef.isTuesday() == (false) && (day.equals("Monday")) && (beef.getInStock().equals("No"))){
            System.out.println("Sorry! 😥 item currently out of stock and even if it wasn't you don't get a discount " +
                    "because" +
                    " its not tuesday" + "\n");
        }else{
            System.out.println("Regular Product price per lb is: " + "$" + beef.getPrice() + "\n");
        }


        Furniture couch = new Furniture();
        couch.setType(ProductTypes.HOUSEWARES);
        couch.setProdName("L-Shape Corner Couch");
        String couchDay = "Monday"; // if statement works when changed to monday
//      couch.setExpiryDate(new Date()); don't need expiry date here couches don't expire lol
        couch.setTuesday(false);
        couch.setInStock("No");
        double couchPrice = couch.setPrice(1500.00);
        couch.setLocation("Leon's, Kenmount rd.");
        String couchManufactdate = "2023-02-13";
        couch.setManufactureDate(LocalDate.parse(couchManufactdate));

        // print statements
        System.out.println("product name is: " + " " + couch.getProdName());
        System.out.println("Product type is: " + " " + couch.getType());
        System.out.println("Product price is: " + "$" + couch.getPrice());
        System.out.println("product Manufacture Date is: " + " " + couch.getManufactureDate());
        if(couch.getExpiryDate() == null) {
            System.out.println("Product Expiry Date is: " + "No Expiry date for product");
        }

        System.out.println("Product Location is:" + " " + couch.getLocation());
        System.out.println("Product in stock:" + " " + couch.getInStock());

        // calculation
        if(couch.isTuesday() && (couch.getInStock().equals("Yes"))){
            System.out.println("Price after discount is: " + (couchPrice - couch.calculateDiscount()));
            System.out.println("Discount amount taken off item is: " + " $" + couch.calculateDiscount() + "\n");

        } else if(couch.isTuesday() == (false) && (couch.getInStock().equals("No"))){
            System.out.println("Sorry! 😥 item currently out of stock and even if it wasn't you don't get a discount " +
                    "because" +
                    " its not tuesday" + "\n");
        }else{
            System.out.println("Regular Product price per is: " + "$" + couch.getPrice() + "\n");
        }



        // third product

        ElectronicDevice smartTV = new ElectronicDevice();
        smartTV.setType(ProductTypes.ELECTRONICS);
        smartTV.setProdName("80 inch Samsung 4K HD-TV ");
        smartTV.setTuesday(true);
//      Smart.setExpiryDate(new Date()); don't need expiry date here tv's don't expire lol
        smartTV.setInStock("Yes");
       double tvPrice =  smartTV.setPrice(2500.00);
        smartTV.setLocation("The Source, Village mall");
        String TvManufactdate = "2022-01-25";
        smartTV.setManufactureDate(LocalDate.parse(TvManufactdate));

        // print statements
        System.out.println("product name is: " + " " + smartTV.getProdName());
        System.out.println("Product type is: " + " " + smartTV.getType());
        System.out.println("Product price is: " + "$" + smartTV.getPrice());
        System.out.println("Product Manufacture Date is: " + " " + smartTV.getManufactureDate());
        if(smartTV.getExpiryDate() == null) {
            System.out.println("Product Expiry Date is: " + "No EXP date for product");
        }

        System.out.println("Product Location is:" + " " + smartTV.getLocation());
        System.out.println("Product in stock:" + " " + smartTV.getInStock());

        // calculation
        if(smartTV.isTuesday() && (smartTV.getInStock().equals("Yes"))){
            System.out.println("Price after discount is: " + (tvPrice - smartTV.calculateDiscount()));
            System.out.println("Discount amount taken off item is: " + " $" + smartTV.calculateDiscount() + "\n");

        } else if(smartTV.isTuesday() == (false)  && (smartTV.getInStock().equals("No"))){
            System.out.println("Sorry! 😥 item currently out of stock and even if it wasn't you don't get a discount " +
                    "because" +
                    " its not tuesday" + "\n");
        }else{
            System.out.println("Regular Product price is: " + "$" + smartTV.getPrice() + "\n");
        }


    }

}