package com.aibank.pattern.command;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 9:59 2019/6/17
 */
public class Test {

    public static void main(String[] args) {
        Receiver receiver  = new Receiver();
        Command cmd  = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
