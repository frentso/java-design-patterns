package com.aibank.pattern.command;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 9:56 2019/6/17
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
