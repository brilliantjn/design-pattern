package com.brill.singleton8;

/**
 * 写法八：枚举
 * <p>
 * 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 *
 * @author brilliantjn
 */
public enum Singleton {

    /**
     * 实例
     */
    INSTANCE;

}
