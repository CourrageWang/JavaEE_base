package com.xiyou.principle.singleresponsibility;

/**
 * 单一原则
 * 方式一 ：违反了单一职责原则
 * 解决办法： 根据交通工具的不同，分解成不同的类。
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

// 交通工具类
class Vehicle {
    void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
}