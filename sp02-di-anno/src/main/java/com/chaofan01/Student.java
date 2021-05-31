package com.chaofan01;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author yan
 * @create 2021 - 05 - 29 0:20
 */

@Component(value = "myStudent")
public class Student implements Serializable {
    private String name;
    private Integer age;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
