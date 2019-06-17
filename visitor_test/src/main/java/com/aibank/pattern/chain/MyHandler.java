package com.aibank.pattern.chain;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 9:47 2019/6/17
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name){
        this.name = name;
    }

    @Override
    public void operator(){
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }

}
