package groups;

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
}
