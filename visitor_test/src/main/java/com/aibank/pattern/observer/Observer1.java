package com.aibank.pattern.observer;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 16:30 2019/6/14
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
