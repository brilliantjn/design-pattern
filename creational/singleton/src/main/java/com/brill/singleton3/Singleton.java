package com.brill.singleton3;

/**
 * 写法三：懒汉（同步代码块）
 *
 * @author brilliantjn
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    /**
     * 同步了代码块，但是仔细分析，多线程下，也会出现 写法一的情况，有可能会产生多个实例。
     *
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}

