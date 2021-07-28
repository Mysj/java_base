package com.mysj.thread;

//创建线程方式一：继承Thread类，重写run方法，调用start开启线程
//总结：注意，县城开启不一定立即执行，由cpu调度
public class TestThread01 extends Thread{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码---"+i);
        }
    }

    public static void main(String[] args) {
        TestThread01 testThread01 = new TestThread01();
        testThread01.start();
        //main线程，主线程
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程---"+i);
        }
    }
}
