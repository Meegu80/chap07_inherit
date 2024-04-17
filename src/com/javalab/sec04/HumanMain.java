package com.javalab.sec03;

import com.javalab.sec04.Student;

public class HumanMain {
    public static void main(String[] args) {

        Student std = new Student("김미소",20,2021001,"컴퓨터공학과");
//        System.out.println("이름: "+ std.name);
//        System.out.println("나이: "+ std.age);
//        System.out.println("학번: "+ std.stdNo);
//        System.out.println("전공: "+ std.major);
         std.showInfo();
        
        Employee std = new Employee("홍길동",30,1001,10);
        System.out.println("이름: "+ emp.name);
        System.out.println("나이: "+ emp.age);
        System.out.println("사번: "+ emp.empNo);
        System.out.println("부서: "+ emp.deptNo);


    }
}
