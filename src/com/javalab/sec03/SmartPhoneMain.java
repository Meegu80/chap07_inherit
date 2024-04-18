package com.javalab.sec03;

public class SmartPhoneMain {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시 s21", "블랙");
        System.out.println("모델 : "+ myPhone.model); //모델 확인
        System.out.println("색상 : "+ myPhone.color); //색상 확인

        System.out.println("자식의 필드 조회 wifi : " + myPhone.wifi);//자식의 필드 조회

        myPhone.bell();// 부모의 메소드 호출
        myPhone.sendVoice("안녕하세요."); // 부모의 메소드 호출
        myPhone.receiveVoice("네 안녕하세요. 반갑습니다"); // 부모의 메소드 호출
        myPhone.hangUp();// 부모의 메소드 호출해서 전화끊기

        // 자식이 가진 메소드 호출
        myPhone.setWifi(true); //wifi 기능 켜기
        myPhone.internet(); // 인터넷 연결

    }
}
