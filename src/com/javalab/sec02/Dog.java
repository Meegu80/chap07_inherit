package com.javalab.sec02;

/**
 * 자식클래스, sub 클래스
 * - Animal 클래스를 상속받음
 */
public class Dog extends Animal{
    // 필드 - 품종
    private String breed;
    // 생성자
    public Dog(String name) {
        super(name);
    }
    // 생성자
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    // 짖는 메소드
    public void bark() {
        System.out.println(name + "이(가) 짖습니다.");
    }
    // 품종을 알려주는 메소드
    public void displayBreed() {
        System.out.println(name + "의 종은 " + breed + "입니다.");
    }
}