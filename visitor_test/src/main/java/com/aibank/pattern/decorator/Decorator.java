package com.aibank.pattern.decorator;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 15:13 2019/6/14
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
