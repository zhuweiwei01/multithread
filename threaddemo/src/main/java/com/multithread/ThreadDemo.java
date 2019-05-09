package com.multithread;

/**
 * 伪代码
 */
public class ThreadDemo {

    public static void main(String[] args) {
        //1.进件
        fillIn();
        processBiz();

        new Thread(() -> {
            sendMsg();
        }).start();

        result();
    }

    public static void fillIn() {
        System.out.println("进件");
    }

    public static void processBiz() {
        System.out.println("处理业务");
    }

    public static void sendMsg() {
        System.out.println("发信息给审批人");
    }

    public static void result() {
        System.out.println("返回结果");
    }

}
