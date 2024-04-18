package com.javalab.sec11;

import java.util.ArrayList;

public class PersonalityMain {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();
        // 세 자녀 객체를 부모 타입 ArrayList에 저장
        ArrayList<Parent> childList = new ArrayList<>();
        childList.add(child1);
        childList.add(child2);
        childList.add(child3);
        // 세 자녀의 성격 출력
        showPersonality(childList);
    }

    public static void showPersonality(ArrayList<Parent> childList) {
        for(Parent children :  childList){
            children.showPersonality();
        }
    }
}
