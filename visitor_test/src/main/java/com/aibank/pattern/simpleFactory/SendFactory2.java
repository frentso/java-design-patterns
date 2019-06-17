package com.aibank.pattern.simpleFactory;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 10:56 2019/6/14
 */
public class SendFactory2 {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

}
