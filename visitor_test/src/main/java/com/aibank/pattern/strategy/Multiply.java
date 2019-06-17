package com.aibank.pattern.strategy;

import java.util.AbstractSequentialList;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 16:21 2019/6/14
 */
public class Multiply extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\*");
        return arrayInt[0]*arrayInt[1];
    }
}
