package com.aibank.pattern.adapter;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 11:59 2019/6/14
 */
public class Adapter extends Source implements Targetable {

    //类的适配器就是使用了其中的一个机制-----无需继承，只要方法名相同包括参数，就可以作为其中的一个实现
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
