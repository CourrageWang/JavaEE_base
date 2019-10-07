package com.xiyou.principle.inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        new Person().reciver(new Email());
    }
}

// 完成一个Person接收消息
// 方式一  实现简单， 如果获取的信息是微信、短信等等， 同时Person也要增加响应的接收方法。
// 解决思路 :引入一个抽象的接口 IReceiver 表示接收者，这样Person类与接口发生依赖【Email，WEIXIN 等等属性接收的范围，他们各自实现
// IReceiver接口  符合依赖倒转原则】

class Email {
    public String getInfo() {
        return "hello this is a message :)";
    }
}

class Person {
    public void reciver(Email message) {
        System.out.println(message.getInfo());
    }
}

