package com.chaofan1.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yan
 * @create 2021 - 05 - 29 13:46
 */
public class ServiceTools {

    public static void doLog() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());
        System.out.println("非业务方法,方法的执行时间:" + format);
    }

    public static void doTrans() {
        System.out.println("方法执行完毕后,提交事务......");
    }
}
