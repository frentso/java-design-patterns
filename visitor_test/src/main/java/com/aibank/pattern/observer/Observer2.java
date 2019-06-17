package com.aibank.pattern.observer;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 16:31 2019/6/14
 */
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.err.println("observer2 has received!");
    }
}
