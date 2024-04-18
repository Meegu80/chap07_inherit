package com.javalab.sec08;

/**
 * 운전자 클래스
 * drive 메소드를 통해서 운송 수단을 전달 받고 해당 객체를 운행한다.
 */
public class Driver{
    // 메소드 선언(운송 수단을 전달받는 매개변수 갖고 있음)
    public void drive(Vehicle vehicle){
        vehicle.run();
    }
}
