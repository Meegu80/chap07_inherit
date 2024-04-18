package com.javalab.sec07;

/**
 * 부모 클래스(super 클래스)
 * 동물 울음 소리를 다형성을 이용하여 구현하는 예제
 * Animal 클래스는 sound()메소드를 가지고 있으며, 이 메소드는 동물들의 울음소리를 출력한다.
 * 동물들은 이 메소드를 오버라이딩하여 자신에게 맞도록 기능을 구현해야 한다.
 */
public class Animal {

    public Animal(){
    }

    public void sound(){
        System.out.println("동물들의 울음소리");

    }
}
