package com.mysj.thread;

//创建线程方式二：实现runnable接口，重写run方法，执行线程需要丢入runnable接口实现类，调用start方法
//注意：这个方法是推荐使用的，避免单继承的局限性，灵活方便，方便同一个对象被多个线程使用
public class TestThread02 implements Runnable{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码--------------"+i);
        }
    }
    public static void main(String[] args) {
        //创建runnable接口实现类
        TestThread02 testThread02 = new TestThread02();
        //创建线程对象，通过线程对象来开启线程，代理
        /*Thread thread = new Thread(testThread02);
        thread.start();*/
        new Thread(testThread02).start();

        //main线程，主线程
        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程---"+i);
        }
    }
}
