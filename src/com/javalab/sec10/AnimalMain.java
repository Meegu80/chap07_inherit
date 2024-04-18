package com.javalab.sec10;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {

        // Cat 객체 생성
        Cat cat = new Cat();
        Dog dog = new Dog();
        // 두 자녀 객체를 부모 타입 ArrayList에 저장합니다.

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);

        performAction(animalList);

    } // end of main

    // perform 메소드 동물들의 타입을 파악해서 해당 자녀의 메소드 호출
    public static void performAction(ArrayList<Animal> animalList) {
        for (Animal animal : animalList) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.meow();
            } else if(animal instanceof Dog){
                Dog dog = (Dog) animal;
                dog.bark();
            }
        } // end of for
    }
}
