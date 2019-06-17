package com.aibank.pattern.strategy;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 16:22 2019/6/14
 */
public class StrategyTest {

    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
