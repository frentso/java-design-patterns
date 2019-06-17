package com.aibank.pattern.observer;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 16:36 2019/6/14
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        norifyObservers();
    }
}
