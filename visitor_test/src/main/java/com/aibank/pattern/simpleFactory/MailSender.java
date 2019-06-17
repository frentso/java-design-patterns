package com.aibank.pattern.simpleFactory;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 10:52 2019/6/14
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("mail send...");
    }
}
