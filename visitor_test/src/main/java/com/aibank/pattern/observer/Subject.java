package com.aibank.pattern.observer;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 16:32 2019/6/14
 */
public interface Subject {

    void add(Observer observer);

    void del(Observer observer);

    void norifyObservers();

    void operation();

}
