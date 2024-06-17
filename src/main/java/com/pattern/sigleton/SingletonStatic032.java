package com.pattern.sigleton;

/**
 * 정적 블록을 사용한 싱글톤
 */
public class SingletonStatic032 {

    private static SingletonStatic032 instance = null;

    static {
        instance = new SingletonStatic032();
    }

    private SingletonStatic032() {
    }

    public static SingletonStatic032 getInstance() {
        return instance;
    }
}
