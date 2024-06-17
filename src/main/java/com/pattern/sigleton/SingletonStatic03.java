package com.pattern.sigleton;

/**
 * 정적 멤버를 이용한 싱글톤
 */
public class SingletonStatic03 {

    private final static SingletonStatic03 instance = new SingletonStatic03();

    private SingletonStatic03() {
    }

    public static SingletonStatic03 getInstance() {
        return instance;
    }
}
