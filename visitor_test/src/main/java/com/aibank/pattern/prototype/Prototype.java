package com.aibank.pattern.prototype;

import java.io.*;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 11:36 2019/6/14
 */
public class Prototype implements Cloneable, Serializable {
    //浅复制
    public Object clone() throws CloneNotSupportedException{
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    //浅复制-》对象复制后，基本数据类型的变量会重新创建，引用类型，指向原对象指向的
    //深复制-》无论基本数据类型还是引用类型，都是重新创建的，，彻底复制

    class SerializableObject implements Serializable {
        private static final long serialVersionUID = 1L;
    }

    private static final long serialVersionUID = 1L;

    private String string;
    private SerializableObject obj;


    //深复制
    public Object deepClone() throws IOException, ClassNotFoundException{
        //写入当前对象到二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);


        //读出二进制流产生新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}
