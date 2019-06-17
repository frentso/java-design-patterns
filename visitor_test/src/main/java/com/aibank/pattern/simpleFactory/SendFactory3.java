package com.aibank.pattern.simpleFactory;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 10:57 2019/6/14
 */
public class SendFactory3 {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
