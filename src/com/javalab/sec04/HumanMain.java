package com.javalab.sec04;

import com.javalab.sec04.Employee;
import com.javalab.sec04.Student;

public class HumanMain {
    public static void main(String[] args) {

        Student std = new Student("김미소",20,2021001,"컴퓨터공학과");
//        System.out.println("이름: "+ std.name);
//        System.out.println("나이: "+ std.age);
//        System.out.println("학번: "+ std.stdNo);
//        System.out.println("전공: "+ std.major);
         std.showInfo();
        System.out.println();
        
        Employee emp = new Employee("홍길동",30,1001,10);
//        System.out.println("이름: "+ emp.name);
//        System.out.println("나이: "+ emp.age);
//        System.out.println("사번: "+ emp.empNo);
//        System.out.println("부서: "+ emp.deptNo);
        emp.showInfo();

        // human 객체 생성
        Student std2 = std; // 학생객체 생성해서 학생 타입에 저장(일반적)
        Human h1 = std;     // 학생 객체 생성해서 부모 타입에 저장(상속, 다형성)
        Human h2 = emp;     // 직원 객체 생성해서 부모 타입에 저장(상송, 다형성)

        System.out.println("-=-=--=-=--==-=-=-=-=-=-=-");
        h1.showInfo();
    }
}
