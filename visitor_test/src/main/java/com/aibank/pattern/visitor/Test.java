package com.aibank.pattern.visitor;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 12:07 2019/6/17
 */
public class Test {

    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
