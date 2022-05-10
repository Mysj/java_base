package com.mysj.singleton;

/**
 * 线程安全的懒汉模式
 * 使用synchronized修饰，性能会偏低
 */
public class Synchronized_LHan {
    private static Synchronized_LHan instance = null;
    private Synchronized_LHan(){};
    public static synchronized Synchronized_LHan getInstance(){
        if (instance == null){
            instance = new Synchronized_LHan();
        }
        return instance;
    }
}
