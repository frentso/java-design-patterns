package com.aibank.pattern.visitor;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 12:06 2019/6/17
 */
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
