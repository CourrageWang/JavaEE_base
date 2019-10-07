package com.xiyou.principle.segregation;

/**
 * 接口的传递实现类的引用
 */
public class Segregation2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.depend(new B2());//A 通过接口依赖B类
        a.depend2(new B2());
        a.depend3(new B2());
    }
}

interface Interface1 {

    void operation1();
}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}

class B2 implements Interface1, Interface2 {

    public void operation1() {

    }

    public void operation2() {

    }

    public void operation3() {

    }
}

class D2 implements Interface1, Interface3 {

    public void operation1() {

    }

    public void operation4() {

    }

    public void operation5() {

    }
}

//A通过接口Interface依赖（使用）B类 但是只会用到1,2,3方法
class A2 {
    public void depend(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}

//C类通过接口Interface依赖（使用）B类 但是只会用到1,4,5方法
class C2 {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }

    public void depend5(Interface3 i) {
        i.operation5();
    }
}