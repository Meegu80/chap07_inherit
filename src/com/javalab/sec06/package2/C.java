package com.javalab.sec06.package2;

import com.javalab.sec06.package1.A;

/**
 * 자식 클래스 C
 * - 부모의 protected 생성자에 패키지가 달라도 접근 가능
 * - C가 A를 상속 받았기 때문에 가능하다.
 */
public class C extends A{
    //생성자 선언
    public C(){
        //super();    // 명시적으로 부모 객체의 생성자 호출
    }
    //메소드 선언
    public void method() {
        //A a = new A();  // 부모 객체의 생성은 자식의 생성자에서 호출

    }
}