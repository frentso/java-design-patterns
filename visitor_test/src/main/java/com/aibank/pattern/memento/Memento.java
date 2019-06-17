package com.aibank.pattern.memento;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 10:09 2019/6/17
 */
public class Memento {

    private String value;

    public Memento(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
