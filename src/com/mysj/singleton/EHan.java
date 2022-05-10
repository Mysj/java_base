package com.mysj.singleton;

/**
 * 饿汉模式----单例模式
 * 在类加载的时候就初始化一个实例，当需要的时候，返回该实例
 * 但是如果单例没有被用到，也会被创建，浪费内存
 */
public class EHan {

    private static EHan instance = new EHan();

    //以下为饿汉模式的变种
    /*private static EHan instance = null;
    static {
        instance = new EHan();
    }*/

    //private修饰构造方法
    private EHan(){};

    public static EHan getInstance(){
        return instance;
    }
}
