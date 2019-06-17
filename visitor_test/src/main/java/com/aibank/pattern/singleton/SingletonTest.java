package com.aibank.pattern.singleton;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 11:26 2019/6/14
 */
public class SingletonTest {

    private static SingletonTest instance = null;

    private SingletonTest() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
