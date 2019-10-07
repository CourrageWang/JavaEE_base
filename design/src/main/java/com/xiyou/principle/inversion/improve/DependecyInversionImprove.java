package com.xiyou.principle.inversion.improve;

public class DependecyInversionImprove {
    public static void main(String[] args) {
        new Person().reciver(new Email());
        new Person().reciver(new WeiXin());
    }
}

// 方式二、
// 定义一个接口
interface IReceiver {
    String getInfo();
}

//邮件
class Email implements IReceiver {
    public String getInfo() {
        return "hello this is a message from Email :)";
    }
}

// 微信
class WeiXin implements IReceiver {

    public String getInfo() {
        return "hello this is a message from WeiXin :)";
    }
}

class Person {
    //对接口的依赖
    public void reciver(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

