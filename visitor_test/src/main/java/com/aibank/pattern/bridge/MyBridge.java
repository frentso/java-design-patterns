package com.aibank.pattern.bridge;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 15:35 2019/6/14
 */
public class MyBridge extends Bridge {

    @Override
    public void method() {
        getSource().method();
    }
}
