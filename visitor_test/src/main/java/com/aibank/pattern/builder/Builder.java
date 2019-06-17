package com.aibank.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 11:31 2019/6/14
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }



}
