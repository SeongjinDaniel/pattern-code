package com.pattern.sigleton;

/**
 * 정적 멤버와 Lazy Holder(중첩 클래스)
 * singleInstanceHolder라는 내부클래스를 하나 더 만듬으로써,
 * Singleon 클래스가 최초에 로딩되더라도 함께 초기화가 되지 않고,
 * getInstance()가 호출될 때 singleInstanceHolder 클래스가 로딩되어 인스턴스를 생성하게 됩니다.
 *
 * 이 방법은 가장 많이 사용되는 방법 중 하나입니다.
 */
public class SingletonInstanceHolder04 {

    private static class singletonInstanceHolder {
        private static final SingletonInstanceHolder04 INSTANCE = new SingletonInstanceHolder04();
    }
    public static SingletonInstanceHolder04 getInstance() {
        return singletonInstanceHolder.INSTANCE;
    }
}
