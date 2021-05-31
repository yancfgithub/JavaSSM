package com.chaofan1.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author yan
 * @create 2021 - 05 - 29 13:49
 */
public class ServiceProxy {

    public Object getProxy(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new ServiceInvocationHandler(obj));
    }
}
