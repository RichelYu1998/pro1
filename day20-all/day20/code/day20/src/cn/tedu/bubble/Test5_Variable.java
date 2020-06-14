package cn.tedu.bubble;

import java.util.Arrays;

//这个类用来测试 jdk新特性 -- 可变参数：反射中用到了Class工具类有体现！！
public class Test5_Variable {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1,2,3,4,5);
    }
    //是方法名相同，但是参数列表不同的方法  --  叫方法的重载  --  出现的目的是提高程序的灵活性
    //1、...就是可变参数的体现，体现了参数的个数  省略不管。
    private static void add(int b,int...a) {//3、可变参数必须是参数列表中的最后一个
        //2、可变参数，为什么传入几个参数  a接收呢？---本质上a是数组  --  [I@1b6d3586
        System.out.println(a);
        System.out.println(Arrays.toString(a));//[1, 2, 3, 4, 5]
    }

}
