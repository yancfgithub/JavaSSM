package com.chaofan01;

import java.io.Serializable;

/**
 * @author yan
 * @create 2021 - 05 - 28 22:25
 */
public class Student implements Serializable {

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
