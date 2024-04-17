package com.javalab.sec04;

/**
 * 학생 클래스, Human 클래스를 상속받음
 * - Human 클래스의 멤버 변수와 메서드를 상속받음.
 */
public class Student extends Human{
    // 필드, 속성, 인스턴변수 선언
    int stdNo;  // 학번
    String major;   // 전공
    // 생성자
    public Student(){}
    // 생성자2
    public Student(String name, int age, int stdNo, String major){
        // 부모 클래스의 생성자 호출
        super(name, age);
        this.stdNo = stdNo;
        this.major = major;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("[Student Info]-----------------");
        System.out.println("학번: " + stdNo);
        System.out.println("전공: " + major);
    }

}