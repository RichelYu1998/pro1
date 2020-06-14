package cn.tedu.reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

//这个类用来测试  反射
public class Test2_Reflect {
    public static void main(String[] args) {
//        method();//反射Class对象
//        method2();//反射创建对象
//        method3();//反射成员变量
//        method4();//反射成员方法
        method5();//反射构造方法
    }
    //反射构造方法
    private static void method5() {
        //1、获取Class对象
        Class clazz = Reflect.class;
        //2、获取所有构造方法
        Constructor[] cs = clazz.getConstructors();
        //3、遍历数组，获取每一个构造方法
        for (Constructor c :cs) {
            //获取构造方法名称
            System.out.println( c.getName() );

            //获取参数类型
            Class[] cs2 = c.getParameterTypes();
            System.out.println(Arrays.toString(cs2));
        }

    }
    //反射成员方法
    private static void method4() {
        //1、获取Class对象
        Class clazz = Reflect.class;

        //2、获取所有的方法们  -- public
        Method[] ms = clazz.getMethods();
        //3、循环获取每个方法m
        for (Method m : ms) {
            //4、打印方法名
            System.out.println(m.getName());

            //5、获取方法的参数类型们
            Class<?>[] cs = m.getParameterTypes();
            System.out.println(Arrays.toString(cs));
        }
    }
    //反射成员变量
    private static void method3() {
        try {
            //获取Class对象
            Class<?> clazz = Class.forName("cn.tedu.reflection.Reflect");
            //获取所有成员变量  -- public
            Field[] fs = clazz.getFields();
            //获取每一个成员变量f
            for (Field f : fs) {
                System.out.println(f.getName());//打印变量名
                System.out.println(f.getType().getName());//打印变量类型
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void method2() {
        try {
            //获取Class对象
            Class clazz = Reflect.class;
            //实例化，触发了无参构造
            Object o = clazz.newInstance();

            //实例化，触发了String类型参数的构造
            Constructor c = clazz.getConstructor(String.class);
            //给String类型的构造方法传入实参
            Object o1 = c.newInstance("熊大");

            System.out.println("o = " + o);
            System.out.println("o1 = " + o1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取Class对象
    private static void method() {
        try {
            //获取Class对象
            Class clazz1 = Reflect.class;
            Class clazz2 = new Reflect().getClass();
            Class clazz3 = Class.forName("cn.tedu.reflection.Reflect");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
