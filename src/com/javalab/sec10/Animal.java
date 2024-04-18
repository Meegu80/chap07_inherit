package com.javalab.sec10;

public class Animal {
    void display(){
        System.out.println("동물입니다.");
    }
}
// Dog 클래스
class Dog extends Animal {
    @Override
    void display() {
        System.out.println("강아지입니다.");
    }
    void bark(){
        System.out.println("멍멍");
    }
} // end of Dog class

// Cat 클래스
class Cat extends Animal {
    @Override
    void display() {
        System.out.println("고양이입니다.");
    }
    void meow(){
        System.out.println("야옹~");
    }
} // end of Cat class