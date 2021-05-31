package com.chaofan03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author yan
 * @create 2021 - 05 - 28 22:25
 */

@Component("myStudent03")
public class Student implements Serializable {

    @Value("王五")
    private String name;
    @Value("17")
    private Integer age;
    @Autowired
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
