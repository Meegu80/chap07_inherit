package com.javalab.sec09;

public class CarMain {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();
        // 타이어객체 생성
        Tire tire = new Tire();
        // Tire 객체 장착(교체)
        myCar.tire = tire;
        // 자동차 운행 지시
        myCar.run(); // 타이어가 회전합니다.

        // HankookTire 객체 생성
        HankookTire hankookTire = new HankookTire();
        // 한국타이어로 교체
        myCar.tire = hankookTire;
        // 자동차 운행 지시
        myCar.run(); // 한국 타이어가 회전합니다.

        // KumhoTire 객체 생성
        KumhoTire kumhoTire = new KumhoTire();
        // 금호타이어로 교체
        myCar.tire = kumhoTire;
        // 자동차 운행 지시
        myCar.run(); // 금호 타이어가 회전합니다.

    }
}