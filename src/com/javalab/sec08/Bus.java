package com.javalab.sec08;

public class Bus extends Vehicle{
    //생성자
    public Bus(){
        super();
    }
    //run 메소드 오버라이딩
    @Override
    public  void run(){
        System.out.println("버스가 정거장 마다 승객들을 태우면서 운행합니다");
    }


}
