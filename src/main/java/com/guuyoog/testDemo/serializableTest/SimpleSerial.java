package com.guuyoog.testDemo.serializableTest;

import java.io.*;

/**
 * 序列化测试
 *
 * @author Guy
 * @create 2017/12/13  12:15
 **/
public class SimpleSerial {

    /**
     * 简而言之:序列化的作用就是为了不同jvm之间共享实例对象的一种解决方案.由java提供此机制,效率之高
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {
        File file = new File("person.out");

        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
        Person person = new Person("John", 101, Gender.MALE);
        oout.writeObject(person);
        oout.close();

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
        /**没有强制转换到Person类型*/
        Object newPerson = oin.readObject();
        oin.close();
        System.out.println(newPerson);
    }

}
