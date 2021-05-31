package com.chaofan1.test;

import com.chaofan1.proxy.ServiceProxy;
import com.chaofan1.service.SomeService;
import com.chaofan1.service.impl.SomeServiceImpl;
import org.junit.Test;

import java.util.Date;

/**
 * @author yan
 * @create 2021 - 05 - 29 13:17
 */
public class MyTest {

    public static void main(String[] args) {
        SomeServiceImpl someService = new SomeServiceImpl();
        someService.doSome();
        System.out.println("==================");
        someService.doOther();


        System.out.println("-------------------分割符---------------------");
        ServiceProxy serviceProxy = new ServiceProxy();
        SomeService service = (SomeService) serviceProxy.getProxy(someService);
        service.doSome();
        System.out.println("==================");
        service.doOther();
    }


}
