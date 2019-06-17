package com.aibank.pattern.command;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 9:55 2019/6/17
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
