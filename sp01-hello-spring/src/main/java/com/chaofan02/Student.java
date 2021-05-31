package com.chaofan02;

import java.io.Serializable;

/**
 * @author yan
 * @create 2021 - 05 - 28 22:25
 */
public class Student implements Serializable {

    private String name;
    private Integer age;
    private School school;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
