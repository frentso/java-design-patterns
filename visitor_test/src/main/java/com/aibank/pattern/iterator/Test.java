package com.aibank.pattern.iterator;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 9:38 2019/6/17
 */
public class Test {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
