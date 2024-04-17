package com.javalab.sec03;

/**
 * 직원 클래스, Human 클래스를 상속받음
 * human 클래스의 멤버 변수와 메서드를 상속받음
 */
public class Employee extends Human {
    // 필드, 속성, 인스턴스 변수
    int empNo; // 사번
    int deptNo; //부서번호

    //생성자

    public Employee() {
    }

    public Employee(String name, int age, int empNo, int deptNo) {
        super(name,age);
        this.empNo = empNo;
        this.deptNo = deptNo;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("[Employee Info]-------------------");
        System.out.println("사번 : " + empNo);
        System.out.println("부서번호 : " + deptNo);
    }
}
