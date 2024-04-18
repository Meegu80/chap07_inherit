package com.javalab.sec07;

/**
 * 자식 클래스로 Animal 클래스를 상속받는다.
 */
public class Cat extends Animal {
    //생성자 선언
    public Cat() {
        super();
    }

    @Override
    public void sound() {
        System.out.println("야옹~");
    }

}
