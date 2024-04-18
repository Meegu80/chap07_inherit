package com.javalab.sec05;

/**
 * 부모 클래스, super class
 * 자식들의 상속하게될 공통 기능 정의
 */
public class Parent {
    // 필드 선언
    protected String field;

    // 생성자 선언
    protected Parent(){
    }

    // 메소드 선언
    public void method1(){
        System.out.println("부모의 method1");
    }
    // 메소드 선언
    public void method2(){
        System.out.println("부모의 method2");
    }
    public void method3(){
        System.out.println("부모의 method3");
    }

}
