package groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class grouponmethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端测试方法1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端测试方法2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端测试方法3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端测试方法4");
    }
    public void beforeGroupsOnServer(){
        System.out.println();
    }
    @BeforeGroups("server")
    public void beforeGroupServer(){
        System.out.println("这是服务端组运行之前的方法");
    }
    @AfterGroups("server")
    public void afterGroupServer(){
        System.out.println("这是服务端组运行之后的方法");
    }
    @BeforeGroups("client")
    public void beforeGroupClient(){
        System.out.println("这是客户端组运行之前的方法");
    }
    @AfterGroups("client")
    public void afterGroupClient(){
        System.out.println("这是客户端组运行之后的方法");
    }
}
