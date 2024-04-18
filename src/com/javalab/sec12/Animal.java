package com.javalab.sec12;

import java.security.PublicKey; /**
 * 추상 클래스 Animal
 * 추상 메소드를 갖고 있는 클래스는 추상 클래스가 된다.
 * 추상 메소드는 내용(구현부)가 없는 껍데기 메소드를 말한다.
 * 이 추상 클래스를 상속하는 자녀는 추상 메소드를 오버라이드 해야한다.
 * 만약 안하면 자신도 추상클래스가 되어야 한다
 * 추상 클래스는 직접적으로 객체로 생성되지 않고 자녀 객체를 생성할 때 객체로 생선된다.
 */
public abstract class Animal {
    protected String name;
    // 생성자
    public Animal(String name){
        this.name = name;
    }
    //추상 메소드(내용부가 없는 껍데가 메소드)
    public abstract void makeSound();
}
// 이너클래스 Dog 정의
class Dog extends Animal{
    // 생성자
    public Dog(String name){
        super(anme);
    }
    // 추상 메소드 오버라이딩
    @Override
    public void makeSound(){
        System.out.println(name + "가 멍멍 짖습니다.");
    }
}
// 이너클래스 Cat 정의
Class Cat extends Animal{
    // 생성자
    Public Cat(String name){
        super(name);
    }
}
