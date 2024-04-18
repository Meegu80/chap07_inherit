package com.javalab.sec09;

/**
 * 다형성 중에서 필드의 다형성을 위한 Car
 *  - 필드에 여러 타이어를 장착할 수 있도록 부모인 Tire타입 변수 선언.
 */
public class Car {
    /**
     * [필드의 다형성]
     * 필드 선언
     * 타이어들이 상속받는 부모 타입을 필드로 갖고 있음
     * Tire 타입 tire변수에 어떤 타이어 객체가 할당 되느냐에 따라서
     * 결과가 달라진다. 즉, 대입되는 타이어의 roll메소드가
     */
    public Tire tire;

    public void run(){

        tire.roll();
    }
}

