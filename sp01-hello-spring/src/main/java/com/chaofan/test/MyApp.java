package com.chaofan.test;

import com.chaofan.service.SomeService;
import com.chaofan.service.impl.SomeServiceImpl;
import org.junit.Test;

/**
 * @author yan
 * @create 2021 - 05 - 27 23:11
 */
public class MyApp {

    @Test
    public void test01() {
        SomeService someService = new SomeServiceImpl();
        someService.doSome();
    }
}
