package com.javalab.sec04;

public class Human {
    // 필드, 속성, (인스턴스) 변수
    String name; //이름
    int age;    //나이

    public Human(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Human() {
    }

    // 이름과 나이 출력해주는 메소드
    public void showInfo() {
        System.out.println("[Human Info]-----------------------");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
