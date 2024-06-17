package com.pattern.sigleton;

/**
 * 멀티스레드 환경에서 인스턴스가 여러개 생길수 있음
 */
public class Singleton01 {
    private static Singleton01 instance;

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        if (instance == null) {
            instance = new Singleton01();
        }
        return instance;
    }

}
