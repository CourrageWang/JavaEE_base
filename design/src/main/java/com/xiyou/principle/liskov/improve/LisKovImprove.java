package com.xiyou.principle.liskov.improve;

public class LisKovImprove {
    public static void main(String[] args) {

    }
}

// 创建一个更加基础的类【解耦】
class Base {
    //把更加基础的方法和成员写的base中
    // 如果B类需要使用A类的方法，使用组合关系
}


class A extends Base {

    public int fun1(int a, int b) {
        return a - b;
    }
}

//增加新的功能，完成两个数的相加并和9求和
class B extends Base {
    //如果B需要使用A类的方法，使用组合方式
    private A a = new A();

    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }

    // 仍然使用A类的方法

    public int fun3(int a, int b) {
        return this.a.fun1(a, b);
    }
}