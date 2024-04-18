package com.javalab.sec01;

/**
 * 자식 클래스(서브 클래스)
 * - Vehicle 클래스를 상속받아 Car 클래스를 정의
 */
public class Car extends  Vehicle{
    private String modelName = "Mustang"; // Car 클래스의 속성
    //게터
    public String getModelName(){
        return modelName;
    }
}
