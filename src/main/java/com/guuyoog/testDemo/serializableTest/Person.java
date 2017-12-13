package com.guuyoog.testDemo.serializableTest;

import java.io.Serializable;

/**
 * @author Guy
 * @create 2017/12/13  11:12
 **/
public class Person implements Serializable {
    /**
     * JDK中提供了另一个序列化接口--Externalizable，使用该接口之后，之前基于Serializable接口的序列化机制就将失效。
     * Externalizable继承于Serializable，当使用该接口时，序列化的细节需要由程序员去完成。
     */

    private String name;

    /**
     * transient 忽略序列化
     */
    transient private Integer age;

    private Gender gender;

    public Person(String name, Integer age, Gender gender) {
        System.out.println("arg constructor");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
