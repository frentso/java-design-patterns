package com.aibank.pattern.iterator;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 9:29 2019/6/17
 */
public interface Iterator {

    public Object previous();

    public Object next();

    public boolean hasNext();

    public Object first();

}
