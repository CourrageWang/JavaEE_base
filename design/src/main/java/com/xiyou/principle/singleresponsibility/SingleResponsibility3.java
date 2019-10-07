package com.xiyou.principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("摩托");
        vehicle2.runAir("飞机");
        vehicle2.runWarter("轮船");
    }
}

/**
 * 1、对原来的类没有做最大的修改
 * 2、类上没有遵循单一职责原则，方法上仍然遵循单一原则。
 */
// 交通工具类
class Vehicle2 {
    void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }

    void runWarter(String vehicle) {
        System.out.println(vehicle + "在水中跑");
    }

    void runAir(String vehicle) {
        System.out.println(vehicle + "在天空跑");
    }
}