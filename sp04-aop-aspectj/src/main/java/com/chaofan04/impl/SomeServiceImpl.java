package com.chaofan04.impl;

import com.chaofan04.SomeService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author yan
 * @create 2021 - 05 - 30 14:11
 */
@Service(value = "mySomeService04")
public class SomeServiceImpl implements SomeService {
    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("doFirst...");
        return "doFirst方法";
    }
}
