package com.course.testng;

import org.testng.annotations.Test;

public class Exception {

    /*
     *什么时候会用到异常测试
     * 我们期望结果为某一个异常的时候
     * 比如：我们传入了不合法的参数，程序抛出了异常
     * 我的预计结果就是异常
     * */

    //这是一个测试结果为失败的
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException() {
        System.out.println();
    }
    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}