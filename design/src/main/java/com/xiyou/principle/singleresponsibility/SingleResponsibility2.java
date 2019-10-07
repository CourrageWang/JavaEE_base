package com.xiyou.principle.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        new RoadVehicle().run("摩托车");
        new AirVehicle().run("飞机");

    }
}

/**
 * 方式二 ： 遵循了单一职责原原则 但是这样做的改动很大，将类分解，客户端也得做修改
 * 改进 : 方案三 直接修改 Vehicle类，改动代码会很少
 */
// 公路上跑的
class RoadVehicle {
    void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
}

// 天空中的
class AirVehicle {
    void run(String vehicle) {
        System.out.println(vehicle + "在天空中飞的");
    }
}

// 水中的
class WarterVehicle {
    void run(String vehicle) {
        System.out.println(vehicle + "在水中的");
    }
}