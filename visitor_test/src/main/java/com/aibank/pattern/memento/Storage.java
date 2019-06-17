package com.aibank.pattern.memento;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 10:11 2019/6/17
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }


}
