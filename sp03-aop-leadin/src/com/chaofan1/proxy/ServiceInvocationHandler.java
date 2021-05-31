package com.chaofan1.proxy;

import com.chaofan1.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yan
 * @create 2021 - 05 - 29 13:50
 */
public class ServiceInvocationHandler implements InvocationHandler {
    Object obj;

    public ServiceInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ServiceTools.doLog();
        Object invoke = method.invoke(obj, args);
        ServiceTools.doTrans();
        return invoke;
    }
}
