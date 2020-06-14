package cn.tedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

//���������ģ��  �ײ㣬��������
public class Test1_Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
//        method();//����Class����
//        method2();//���乹�췽��
//        method3();//������ͨ����
//        method4();//�����Ա����
        method5();//���䴴������
    }
    //���䴴������
    public static void method5() {
        try {
            //1�������ȡClass����
            Class<?> clazz = Student.class;
            //2����������
            Object obj = clazz.newInstance();//�����޲ι���
            System.out.println("obj = " + obj);

            //3���������ι��촴������--
//��ָ��Ҫ���������ĸ�������ʽ�Ĺ��췽����--�������βε��������Ͷ�Ӧ��Class����
            Constructor<?> c = clazz.getConstructor(String.class, int.class);
            //ָ����������ʱ��ʵ��name,age
            Object obj2 = c.newInstance("ƤƤϼ",23) ;
            System.out.println("obj2 = " + obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //�����Ա����
    public static void method4() {
        try {
            //1������Class����
            Class<?> clazz = Class.forName("cn.tedu.reflection.Student");
            //2�������ȡ����  ��Ա������  -- ֻ�ܻ�ȡ��public��
            Field[] fs = clazz.getFields();
            //3���������飬��ȡÿ����Ա����
            for (Field f : fs) {//f����õ��ı���
                //��ȡ������
                System.out.println(f.getName());
                //��ȡ����������
                System.out.println(f.getType().getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //������ͨ����
    public static void method3() {
        //1������Class����
        Class<?> clazz = new Student().getClass();
        //2����������  ������
        Method[] ms = clazz.getMethods();
        //3�������ȡÿ������
        for (Method m : ms) {//m�����䵽�ķ���
            //��ȡ������
            System.out.println(m.getName());
            //4����ȡ������������
            Class<?>[] cs = m.getParameterTypes();
            System.out.println(Arrays.toString(cs));
        }
    }

    //���乹�췽��
    public static void method2() {
        //1������Class����
        Class<?> clazz = Student.class;
        //2���������� �� ���췽����
        Constructor<?>[] cs = clazz.getConstructors();
        //3���������ݣ���ȡÿ�����췽��
        for (Constructor c : cs) {//c�ʹ���ǰ�������Ĺ��췽��
            //4����ȡ��������
            Class<?>[] cs2 = c.getParameterTypes();
            System.out.println(Arrays.toString(cs2));
        }
    }

    //����Class����
    public static void method() throws ClassNotFoundException {
        //���������ȫ·�� �� ����.����
        Class<?> clazz1 = Class.forName("cn.tedu.reflection.Student");
        Class<?> clazz2 = Student.class;
        Class<?> clazz3 = new Student().getClass();//new Student()����������

        System.out.println("clazz1 = " + clazz1);
        System.out.println("clazz2 = " + clazz2);
        System.out.println("clazz3 = " + clazz3);
    }
}
