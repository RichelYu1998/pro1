package cn.tedu.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//�������������  �������䣺��Ҫ�ǻ�ȡ˽�е�
public class Test3_Reflect {
    public static void main(String[] args) {
//        method();//��ȡ����
        method2();//��ȡ����
    }
    //���������ȡ˽�б���
    public static void method2() {
        try {
            //1����ȡClass����
            Class clazz = Reflect.class;
            //2����������
            Field f = clazz.getDeclaredField("age");
            System.out.println( f.getType().getName());//int

            //3������˽�пɼ�
            f.setAccessible(true);
            //4�����û�ȡ��ȡ����ֵ
            Object obj = clazz.newInstance();
            f.set(obj,100);//���ñ���ֵ
            System.out.println(  f.get(obj) );//��ȡ����ֵ
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //���������ȡ˽�з���
    public static void method() {
        try {
            //1����ȡClass����
            Class clazz = Reflect.class;
            //2����������
            // ��һ�������Ƿ�����,
            // �ڶ������������������Ҫ�����͵�class����
            Method m = clazz.getDeclaredMethod("show2", String.class, int.class);
            //3�����÷���Ȩ�ޣ�--˽�пɼ�
            m.setAccessible(true);
            //4��invoke()�÷���ִ������
            //��һ�������ǣ�Ҫִ���ĸ�����ķ������ڶ��������ǣ�Ҫ����������ʲôʵ��
            Object obj = clazz.newInstance();
            m.invoke(obj, "jack", 20);//ִ�з��������������
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
