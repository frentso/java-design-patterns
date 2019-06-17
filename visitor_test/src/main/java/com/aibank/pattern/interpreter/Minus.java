package com.aibank.pattern.interpreter;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 18:03 2019/6/17
 */
public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
