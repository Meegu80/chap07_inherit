package com.javalab.sec09;

/**
 * 금호타이어
 * Tire를 상속받아 구현한 금호타이어 클래스
 */
public class KumhoTire extends Tire{
    //메소드 재정의(오버라이딩)
    @Override
    public void roll(){
        System.out.println("금호타이어가 회전합니다");
    }
}
