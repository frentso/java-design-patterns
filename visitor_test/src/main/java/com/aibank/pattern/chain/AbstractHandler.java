package com.aibank.pattern.chain;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 9:46 2019/6/17
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler(){
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }


}
