package com.aibank.pattern.observer;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 16:37 2019/6/14
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
    }
}
