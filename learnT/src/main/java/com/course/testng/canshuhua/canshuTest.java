package com.course.testng.canshuhua;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.xml.namespace.QName;

public class canshuTest {
    @Test
    @Parameters({"name","age"})
    public void canshuTest1(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }
}
