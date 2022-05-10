package com.mysj.singleton;

/**
 * 懒汉模式实现单例模式
 * 需要使用时才去创建实例
 * 但是没有考虑线程安全问题，多个线程并发调用getInstance()，可能会创建多个实例
 */
public class LHan {
    //private修饰构造方法
    private LHan(){};
    private static LHan instance = null;

    public static LHan getInstance(){
        if (instance == null){
            instance = new LHan();
        }
        return instance;
    }

}
