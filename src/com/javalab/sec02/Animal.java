package com.javalab.sec02;

/**
 * 부모 클래스, super 클래스
 */
public class Animal {
    // 핃드
    public Animal() {
    }

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "이(가) 먹이를 먹습니다.");
    }
}
