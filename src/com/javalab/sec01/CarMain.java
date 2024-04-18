package com.javalab.sec01;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + "\t" + myCar.getModelName());

    }
}
