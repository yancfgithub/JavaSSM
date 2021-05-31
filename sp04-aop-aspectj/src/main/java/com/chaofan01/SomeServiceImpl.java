package com.chaofan01;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author yan
 * @create 2021 - 05 - 30 1:57
 */

@Component("mySomeService")
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("业务doSome...");
    }
}
