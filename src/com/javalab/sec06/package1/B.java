package com.javalab.sec06.package1;

public class B {
    // 생성자 선언
    protected B() {
    }
    // 메소드 선언
    public void method(){
        // 같은 패키지에 있는 A클래스 객체 생성
        A a = new A();  // A가 protected(디폴트와 같은 같은 패키지안에서 공유)


    }
}
