package com.aibank.pattern.iterator;


/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 9:28 2019/6/17
 */
public interface Collection {

    public Iterator iterator();

    public Object get(int i);

    public int size();
}
