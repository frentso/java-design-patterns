package com.aibank.pattern.template;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 16:26 2019/6/14
 */
public class StrategyTest {

    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
