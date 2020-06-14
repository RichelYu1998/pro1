package cn.tedu.reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

//�������������  ����
public class Test2_Reflect {
    public static void main(String[] args) {
//        method();//����Class����
//        method2();//���䴴������
//        method3();//�����Ա����
//        method4();//�����Ա����
        method5();//���乹�췽��
    }
    //���乹�췽��
    private static void method5() {
        //1����ȡClass����
        Class clazz = Reflect.class;
        //2����ȡ���й��췽��
        Constructor[] cs = clazz.getConstructors();
        //3���������飬��ȡÿһ�����췽��
        for (Constructor c :cs) {
            //��ȡ���췽������
            System.out.println( c.getName() );

            //��ȡ��������
            Class[] cs2 = c.getParameterTypes();
            System.out.println(Arrays.toString(cs2));
        }

    }
    //�����Ա����
    private static void method4() {
        //1����ȡClass����
        Class clazz = Reflect.class;

        //2����ȡ���еķ�����  -- public
        Method[] ms = clazz.getMethods();
        //3��ѭ����ȡÿ������m
        for (Method m : ms) {
            //4����ӡ������
            System.out.println(m.getName());

            //5����ȡ�����Ĳ���������
            Class<?>[] cs = m.getParameterTypes();
            System.out.println(Arrays.toString(cs));
        }
    }
    //�����Ա����
    private static void method3() {
        try {
            //��ȡClass����
            Class<?> clazz = Class.forName("cn.tedu.reflection.Reflect");
            //��ȡ���г�Ա����  -- public
            Field[] fs = clazz.getFields();
            //��ȡÿһ����Ա����f
            for (Field f : fs) {
                System.out.println(f.getName());//��ӡ������
                System.out.println(f.getType().getName());//��ӡ��������
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void method2() {
        try {
            //��ȡClass����
            Class clazz = Reflect.class;
            //ʵ�������������޲ι���
            Object o = clazz.newInstance();

            //ʵ������������String���Ͳ����Ĺ���
            Constructor c = clazz.getConstructor(String.class);
            //��String���͵Ĺ��췽������ʵ��
            Object o1 = c.newInstance("�ܴ�");

            System.out.println("o = " + o);
            System.out.println("o1 = " + o1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //��ȡClass����
    private static void method() {
        try {
            //��ȡClass����
            Class clazz1 = Reflect.class;
            Class clazz2 = new Reflect().getClass();
            Class clazz3 = Class.forName("cn.tedu.reflection.Reflect");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
