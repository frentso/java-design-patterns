package com.aibank.pattern.mediator;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 17:21 2019/6/17
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
