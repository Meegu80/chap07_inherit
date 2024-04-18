package com.javalab.sec08;

public class Taxi extends Vehicle {
    public Taxi(){
        super();
    }

    @Override
    public void run() {
        System.out.println("택시가 승객을 태우고 목적지까지 운행합니다");
    }
}
