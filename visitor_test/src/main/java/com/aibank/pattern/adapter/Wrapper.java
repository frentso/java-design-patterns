package com.aibank.pattern.adapter;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 12:02 2019/6/14
 */
public class Wrapper implements Targetable {
    //对象的适配器模式，，就是将需要适配的作为类的一个  Field
    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
