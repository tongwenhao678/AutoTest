package com.course.testng.multTHread;

import org.testng.annotations.Test;

public class MultTHreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 5)
    public void test(){
        System.out.println();
        System.out.printf("thread id: %s%n",Thread.currentThread().getId());
    }
}
