package com.course.testng.multTHread;

import org.testng.annotations.Test;

public class MultThreadOnXML {
    @Test
    public void test1(){
        System.out.println(1);
        System.out.printf("Thread ID: %s%n",Thread.currentThread());
    }
    @Test
    public void test2() {
        System.out.println(1);
        System.out.printf("Thread ID: %s%n", Thread.currentThread());
    }
    @Test
    public void test3() {
        System.out.println(1);
        System.out.printf("Thread ID: %s%n", Thread.currentThread());
    }
}

