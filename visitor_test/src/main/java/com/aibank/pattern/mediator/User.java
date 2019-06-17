package com.aibank.pattern.mediator;

import javax.print.attribute.standard.Media;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 13:56 2019/6/17
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void work();
}
