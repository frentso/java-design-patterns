package com.aibank.pattern.abstractFactory;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 10:53 2019/6/14
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("sms send...");
    }
}
