package com.course.testng.canshuhua;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name =" + name + "; age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"zhangsan", 10},
                {"list", 20},
                {"wangwu", 30}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test111方法" + "name=" + name + "; age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test222方法" + "name" + name + "; age=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method1){
        Object[][] result=null;
        if(method1.getName().equals("test1")){
            result=new Object[][]{
                    {"zhangsan",15},
                    {"lisi",16}
            };

        }else if(method1.getName().equals("test2")) {
            result = new Object[][]{
                    {"wanger", 34},
                    {"maxin", 45}
            };

        }
        return result;
    }
}
