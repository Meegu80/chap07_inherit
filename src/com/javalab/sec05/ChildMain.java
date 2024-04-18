package com.javalab.sec05;

public class ChildMain{
    public static void main(String[] args) {
        // 자식 객체 생성해서 자식 타입에 할당
        Child child = new Child();
        // 상속 받은 부모 메소드 호출 가능
        child.method1();
        // 나의 메소드 호출됨.
        child.method2();
        // 나의 메소드 호출
        child.method3();

        // 자식 객체 생성해서 부모 타입에 저장
        // 1. 자식 객체를 부모 타입에 저장하면 자동으로 형번환이 일어남.
        // 2. 부모 타입으로 형변환 되었으므로 부모 것만 보임
        Parent parent = new Child(); // 자식 객체를 부모 타입에 할당
        parent.method1(); // 호출 Ok
        // 호출 OK, 하지만 자식의 메소드가 호출됨.
        // 이유는 자식이 부모의 것을 오버라이딩 했기 때문에.
        parent.method2();
        // 호출 OK, 하지만 자식의 메소드가 호출됨.
        parent.method3(); //(불가능이였지만, 부모 클래스에 메소드3를
                          // 만들어 주면 자식의 메소드3가 오버라이딩되면서 호출이 가능해진다)
        // 부모 타입 변수를 자식 타입으로 강제 형변환'( )'표시
        // 1. 부모 타입 변수를 자식 타입으로 형변환하면 자식 타입의 메소드를 호출할 수 있다
        Child child1 = (Child) parent;
        child1.method3();
    }
}
