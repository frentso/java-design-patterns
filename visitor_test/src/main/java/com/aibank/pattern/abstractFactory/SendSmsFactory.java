package com.aibank.pattern.abstractFactory;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 11:01 2019/6/14
 */
public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
