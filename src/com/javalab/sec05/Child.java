package com.javalab.sec05;

/**
 * 자식 클래스
 */
public class Child extends Parent {
    // 필드선언
    public String field2;
    //메소드선언
    public void method2(){
        System.out.println("자식이 오버라이딩한 method2");
    }
    //메소드 선언
    public void method3(){System.out.println("자식의 method3"); // 자식 메소드3를 지워도
                                                               // 부모에게 메소드3가 있어서 호출가능
    }
}
