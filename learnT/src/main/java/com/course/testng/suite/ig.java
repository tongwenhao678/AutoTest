package com.course.testng.suite;

import org.testng.annotations.Test;

public class ig {
    @Test
    public void ig1(){
        System.out.println("ig1run");
    }
    @Test(enabled = false)
    public void ig2(){
        System.out.println("ig2run");
    }
    @Test(enabled = true)
    public void ig3(){
        System.out.println("ig3run");
    }
}
