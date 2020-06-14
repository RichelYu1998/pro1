package cn.tedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

//这个类用来模拟  底层，反射数据
public class Test1_Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
//        method();//反射Class对象
//        method2();//反射构造方法
//        method3();//反射普通方法
//        method4();//反射成员变量
        method5();//反射创建对象
    }
    //反射创建对象
    public static void method5() {
        try {
            //1、反射获取Class对象
            Class<?> clazz = Student.class;
            //2、创建对象
            Object obj = clazz.newInstance();//触发无参构造
            System.out.println("obj = " + obj);

            //3、触发含参构造创建对象--
//先指定要触发的是哪个重载形式的构造方法？--参数是形参的数据类型对应的Class对象
            Constructor<?> c = clazz.getConstructor(String.class, int.class);
            //指定创建对象时的实参name,age
            Object obj2 = c.newInstance("皮皮霞",23) ;
            System.out.println("obj2 = " + obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //反射成员变量
    public static void method4() {
        try {
            //1、反射Class对象
            Class<?> clazz = Class.forName("cn.tedu.reflection.Student");
            //2、反射获取所有  成员变量们  -- 只能获取到public的
            Field[] fs = clazz.getFields();
            //3、遍历数组，获取每个成员变量
            for (Field f : fs) {//f代表得到的变量
                //获取变量名
                System.out.println(f.getName());
                //获取变量的类型
                System.out.println(f.getType().getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //反射普通方法
    public static void method3() {
        //1、反射Class对象
        Class<?> clazz = new Student().getClass();
        //2、反射所有  方法们
        Method[] ms = clazz.getMethods();
        //3、反射获取每个方法
        for (Method m : ms) {//m代表反射到的方法
            //获取方法名
            System.out.println(m.getName());
            //4、获取方法参数类型
            Class<?>[] cs = m.getParameterTypes();
            System.out.println(Arrays.toString(cs));
        }
    }

    //反射构造方法
    public static void method2() {
        //1、反射Class对象
        Class<?> clazz = Student.class;
        //2、反射所有 的 构造方法们
        Constructor<?>[] cs = clazz.getConstructors();
        //3、遍历数据，获取每个构造方法
        for (Constructor c : cs) {//c就代表当前遍历到的构造方法
            //4、获取参数类型
            Class<?>[] cs2 = c.getParameterTypes();
            System.out.println(Arrays.toString(cs2));
        }
    }

    //反射Class对象
    public static void method() throws ClassNotFoundException {
        //参数是类的全路径 ： 包名.类名
        Class<?> clazz1 = Class.forName("cn.tedu.reflection.Student");
        Class<?> clazz2 = Student.class;
        Class<?> clazz3 = new Student().getClass();//new Student()是匿名对象

        System.out.println("clazz1 = " + clazz1);
        System.out.println("clazz2 = " + clazz2);
        System.out.println("clazz3 = " + clazz3);
    }
}
