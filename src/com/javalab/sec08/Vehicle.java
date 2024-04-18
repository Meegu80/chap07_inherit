package com.javalab.sec08;

import java.sql.SQLOutput;

/**
 * 운송수단을 나태내는 부모 클래스
 * Vehicle 클래스는 run() 메소드를 가지고 있으며,
 * 이 메소드는 차량이 달린다는 메시지를 출련한다.
 * 자식 클래스는 run 메소드를 오버라이딩하여 자신만의 운송 수단을 구현한다.
 */

public class Vehicle {
    public Vehicle(){

    }

    public void run(){
        System.out.println("차량이 달립니다");

    }

}
