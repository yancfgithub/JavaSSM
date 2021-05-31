package com.chaofan02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author yan
 * @create 2021 - 05 - 29 0:20
 */

@Component(value = "myStudent2")
public class Student implements Serializable {
    @Value(value = "老吴")
    private String name;
    @Value(value = "29")
    private Integer age;

    /*public String getName() {
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
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
