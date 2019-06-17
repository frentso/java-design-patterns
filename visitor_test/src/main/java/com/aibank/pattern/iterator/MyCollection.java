package com.aibank.pattern.iterator;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 9:32 2019/6/17
 */
public class MyCollection implements Collection {

    public String[] string = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
