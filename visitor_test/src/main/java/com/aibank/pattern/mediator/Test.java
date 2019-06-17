package com.aibank.pattern.mediator;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 17:35 2019/6/17
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }

}
