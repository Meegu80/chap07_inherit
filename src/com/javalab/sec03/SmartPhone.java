package com.javalab.sec03;

/**
 * 스마트폰 클래스, 자식 클래스(서브클래스)
 * - Phone을 상속받아서 기본 기능을 물려받고,
 * - 추가로 본인이 필요한 기능을 더 구현한다.
 */
public class SmartPhone extends Phone{
    // Phone 의 필드와 메소드가 들어와 있다.(자식의 자산)

    // 자식이 추가한 필드
    public boolean wifi;

    // 생성자
    public SmartPhone(String model, String color){
        this.model = model; // 부모의 필드이지만 자식의 것이다.
        this.color = color; // 부모의 필드이지만 자식의 것이다.
    }

    // 자식이 추가한 메소드 wifi 기능 세팅
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("wifi 상태를 변경했습니다.");
    }

    // 인터넷 연결
    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}