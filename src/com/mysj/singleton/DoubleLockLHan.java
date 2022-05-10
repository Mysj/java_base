package com.mysj.singleton;

/**
 * 使用双重校验锁
 * 大部分情况下，同步代码块都不会执行到，提高了程序的性能。
 *
 * 有一种情况，两个线程ThreadA，ThreadB，如果threadA执行到了第一个if条件判断，
 * instance = null；ThreadB也执行到了if条件判断instance = null，
 * 所以A和B会依次执行同步代码块里的代码。为了避免创建两个实例，因此又在同步代码块里添加了if条件进行二重检验。
 */
public class DoubleLockLHan {
    //注意这里使用volatile修饰instance
    private static volatile DoubleLockLHan instance = null;
    private DoubleLockLHan(){};

    public static DoubleLockLHan getInstance(){
        //给代码块加锁
        synchronized(DoubleLockLHan.class){
            if (instance == null){
                instance = new DoubleLockLHan();
            }
        }
        return instance;
    }
}
