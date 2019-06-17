package com.aibank.pattern.simpleFactory;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 10:54 2019/6/14
 */
public class SendFactory {

    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.printf("请输入正确的类型");
            return null;
        }
    }

}
