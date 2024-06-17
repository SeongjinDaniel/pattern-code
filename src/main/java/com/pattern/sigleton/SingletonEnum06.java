package com.pattern.sigleton;

/**
 * enum의 인스턴스는 기본적으로 스레드세이프(thread safe)한 점이 보장되기 때문에 이를 통해 생성할 수 있습니다.
 *
 * 이 방법은 이펙티브 자바를 쓴 조슈아 클로크가 추천하는 방법 중 하나입니다.
 */
public enum SingletonEnum06 {
    INSTANCE;
    public void oortCloud() {
    }
}
