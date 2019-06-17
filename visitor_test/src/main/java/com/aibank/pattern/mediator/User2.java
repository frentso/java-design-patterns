package com.aibank.pattern.mediator;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 17:23 2019/6/17
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
