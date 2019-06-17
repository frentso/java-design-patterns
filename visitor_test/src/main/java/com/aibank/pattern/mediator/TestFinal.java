package com.aibank.pattern.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 16:07 2019/6/17
 */
public class TestFinal {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        final AddInt addInt = new AddInt();
        for (final Integer i : list) {
            pool.execute(new Runnable() {

                @Override
                public void run() {
                    addInt.setA(i);
                    showAdd(addInt, i);
                }
            });
        }
    }

    public static void showAdd(AddInt addInt, int b) {
        System.out.println(addInt.getA() + b);
    }
}

class AddInt{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}



