package groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class groupOnClass2{
    public void stu1(){
        System.out.println("GroupOnClass2中的stu1运行的");
    }
    public void stu2(){
        System.out.println("GroupOnClass中的stu2运行的");
    }
}
