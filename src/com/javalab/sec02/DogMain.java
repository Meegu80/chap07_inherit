package com.javalab.sec02;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", "시츄");
        dog.bark();
        dog.displayBreed();
        dog.eat();
    }
}
