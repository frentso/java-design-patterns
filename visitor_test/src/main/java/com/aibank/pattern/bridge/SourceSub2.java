package com.aibank.pattern.bridge;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 15:33 2019/6/14
 */
public class SourceSub2 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}
