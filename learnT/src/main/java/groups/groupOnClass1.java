package groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class groupOnClass1 {
    public void stu1(){
        System.out.println("GroupOnClass1中stu1运行");
    }
    public void stu12(){
        System.out.println("GroupOnClass1中stu1运行");
    }
}
