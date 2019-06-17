package com.aibank.pattern.visitor;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 12:05 2019/6/17
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject subject) {
        System.out.println("visit the subject: " + subject.getSubject());
    }
}
