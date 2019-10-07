package com.xiyou.principle.liskov;

public class LisKov {
    public static void main(String[] args) {

    }
}


class A {

    public int fun1(int a, int b) {
        return a - b;
    }
}

//增加新的功能，完成两个数的相加并和9求和
class B extends A {

    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }
}