package com.aibank.pattern.state;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 10:44 2019/6/17
 */
public class State {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("execute the first opt!");
    }

    public void method2(){
        System.out.println("execute the second opt!");
    }
}
