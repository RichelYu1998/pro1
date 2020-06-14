package cn.tedu.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//这个类用来测试  暴力反射：主要是获取私有的
public class Test3_Reflect {
    public static void main(String[] args) {
//        method();//获取方法
        method2();//获取变量
    }
    //暴力反射获取私有变量
    public static void method2() {
        try {
            //1、获取Class对象
            Class clazz = Reflect.class;
            //2、暴力反射
            Field f = clazz.getDeclaredField("age");
            System.out.println( f.getType().getName());//int

            //3、设置私有可见
            f.setAccessible(true);
            //4、设置获取获取属性值
            Object obj = clazz.newInstance();
            f.set(obj,100);//设置变量值
            System.out.println(  f.get(obj) );//获取变量值
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //暴力反射获取私有方法
    public static void method() {
        try {
            //1、获取Class对象
            Class clazz = Reflect.class;
            //2、暴力反射
            // 第一个参数是方法名,
            // 第二个参数是这个方法需要的类型的class对象
            Method m = clazz.getDeclaredMethod("show2", String.class, int.class);
            //3、设置访问权限，--私有可见
            m.setAccessible(true);
            //4、invoke()让方法执行起来
            //第一个参数是，要执行哪个对象的方法。第二个参数是，要给方法传入什么实参
            Object obj = clazz.newInstance();
            m.invoke(obj, "jack", 20);//执行方法，并传入参数
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
