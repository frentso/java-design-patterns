package com.aibank.pattern.abstractFactory;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 11:02 2019/6/14
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
