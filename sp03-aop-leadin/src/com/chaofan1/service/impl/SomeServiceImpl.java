package com.chaofan1.service.impl;

import com.chaofan1.service.SomeService;

/**
 * @author yan
 * @create 2021 - 05 - 29 13:15
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("业务执行doSome...");
    }

    @Override
    public void doOther() {
        System.out.println("业务执行doOther...");
    }
}
