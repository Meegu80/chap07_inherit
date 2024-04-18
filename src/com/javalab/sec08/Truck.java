package com.javalab.sec08;

public class Truck extends Vehicle {
    // 생성자
    public Truck(){
        super();
    }
    // run메소드 오버라이딩
    @Override
    public void run(){
        System.out.println("짐을 싣고 이동합니다.");
    }

}
