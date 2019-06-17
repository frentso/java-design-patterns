package com.aibank.pattern.proxy;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 15:23 2019/6/14
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method");
    }
}
