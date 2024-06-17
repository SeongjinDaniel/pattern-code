package com.pattern.sigleton;

/**
 * 멀티스레드 환경에서 인스턴스가 여러개 생길수 있음
 */
public class SingletonSync01 {
    private static SingletonSync01 instance;

    private SingletonSync01() {
    }

    public static synchronized SingletonSync01 getInstance() {
        if (instance == null) {
            instance = new SingletonSync01();
        }
        return instance;
    }

}
