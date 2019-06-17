package com.aibank.pattern.interpreter;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 18:03 2019/6/17
 */
public class Test {

    public static void main(String[] args) {
        int result = new Minus().interpret(new Context(new Plus().interpret(new Context(9,2)),8));
        System.out.println(result);
    }

}
