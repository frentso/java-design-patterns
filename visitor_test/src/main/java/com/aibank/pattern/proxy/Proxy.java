package com.aibank.pattern.proxy;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 15:23 2019/6/14
 */
public class Proxy implements Sourceable {


    private Source source;

    //代理模式和装饰模式的区别在于这个代理的对象，装饰的对象是否从外部传入。
    public Proxy(){
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after(){
        System.out.println("after proxy!");
    }

    private void before(){
        System.out.println("before proxy");
    }
}
