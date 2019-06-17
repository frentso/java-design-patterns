package com.aibank.pattern.bridge;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 15:34 2019/6/14
 */
public abstract class Bridge {
    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }


}
