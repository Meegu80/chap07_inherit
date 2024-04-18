package com.javalab.sec03;

/**
 * 부모 클래스(수퍼클래스) Phone에 관한 기본적인 기능 정의
 * - 이 Phone을 상속받아서 다른 폰들이 만들어진다.
 */
public class Phone {
    // 필드 선언
    public String model;
    public String color;
    // 생성자 선언을 안하면 빈 생성자를 콤파일러가 만들어준다 "public Phone(){}"
    // 메소드 선언
    public void bell(){
        System.out.println("벨이 울립니다.");
    }
    // 목소리 전달 메소드
    public void sendVoice(String message){
        System.out.println("자기: " + message);
    }
    // 전화받기 메소드
    public void receiveVoice(String message){
        System.out.println("상대방: " + message);
    }
    // 전화 끊기 메소드
    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
}