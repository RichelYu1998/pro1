package cn.tedu.reflection;
//�������������  �ڲ���
public class Test4_InnerClass {
    public static void main(String[] args) {
        //1�������ڲ������    ---    �ⲿ����.�ڲ�����   ���� =  �ⲿ�����.�ڲ������
        Outer.Inner oi = new Outer().new Inner();
        //2�������ڲ������Դ
        oi.showIn();
        System.out.println( oi.age );
    }
}
class Outer{//�ⲿ��
    String name = "ƤƤϼ" ;
    public void showOut(){
        System.out.println("showOut()...");
    }
    class Inner{//�ڲ���
        int age = 20 ;
        public void showIn(){
            System.out.println("showIn()...");
        }
    }
}



