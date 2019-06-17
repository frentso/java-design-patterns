package com.aibank.pattern.visitor;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 12:04 2019/6/17
 */
public interface Subject {

    public void accept(Visitor visitor);

    public String getSubject();
}
