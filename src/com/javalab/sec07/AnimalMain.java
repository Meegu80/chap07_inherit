package com.javalab.sec07;

import com.javalab.sec06.package1.A;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        // 동물들 객체 각각 생성
        Dog dog = new Dog();
        Cow cow = new Cow();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();

        // 생성한 Dog 객체를 부모타입에 저장
        Animal animal1 = dog; // 자동 타입 변환, 부모 것만 보임, 하지만 자식 오버라이딩한 메소드 호출됨.
        animal1.sound();
        Animal animal2 = cow;
        animal2.sound();
        System.out.println();

        // 동물 배열 만들어서 동물 객체 모두 저장.
        Animal[] animals = new Animal[4];
        // 동물 객체들을 부모 타입 배열에 각각 저장
        animals[0] = dog;
        animals[1] = cow;
        animals[2] = cat;
        animals[3] = wolf;
        for (Animal animal: animals ){
            animal.sound();
        }
        System.out.println();

        // 동물 ArrayList 만들어서 동물 객체 모두 저장.
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        // 동물 객체들을 부모 타입 ArrayList에 각각 저장
        animalList.add(dog);
        animalList.add(cow);
        animalList.add(cat);
        animalList.add(wolf);
        for (Animal animal: animalList){
            animal.sound();
        }
    }
}