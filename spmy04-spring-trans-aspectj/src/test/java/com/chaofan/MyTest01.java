package com.chaofan;

import com.chaofan.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yan
 * @create 2021 - 05 - 30 19:15
 */
public class MyTest01 {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BuyGoodsService buyGoodsService = (BuyGoodsService) context.getBean("buyGoodsService");
        buyGoodsService.buy(1002,10);
    }
}
