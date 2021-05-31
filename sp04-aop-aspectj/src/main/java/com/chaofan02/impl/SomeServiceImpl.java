package com.chaofan02.impl;

import com.chaofan02.SomeService;
import org.springframework.stereotype.Service;

/**
 * @author yan
 * @create 2021 - 05 - 30 13:40
 */
@Service("mySomeService02")
public class SomeServiceImpl implements SomeService {
    @Override
    public String doOther(String str) {
        System.out.println("这是业务方法doOther......" + str);
        return "Other完毕";
    }
}
