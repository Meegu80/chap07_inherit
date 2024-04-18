package com.javalab.sec08;

public class DriverMain{
    public static void main(String[] args) {
        // Driver 객체 생성
        Driver driver = new Driver();
        // 운행할 운송 수당 객체 생성
        Bus bus = new Bus();
        // 드라이버에게 버스 운송 요청
        driver.drive(bus);

        // 택시 객체 생성
        Taxi taxi = new Taxi();
        // 드라이버에게 택시 운송 요청
        driver.drive(taxi);

        // 트럭 객체 생성
        Truck truck = new Truck();
        // 드라이버에게 트럭 운송 요청
        driver.drive(truck);
    }
}