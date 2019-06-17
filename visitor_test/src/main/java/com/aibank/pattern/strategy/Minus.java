package com.aibank.pattern.strategy;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 16:20 2019/6/14
 */
public class Minus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}
