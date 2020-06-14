package cn.tedu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//������������� ���л�  �����л�
public class Test1_Seria {
	public static void main(String[] args) {
//		method() ; //���л�
		method2();//�����л�
	}
	//�����л����Ѵ������Ѿ����л��õ��ļ�����ȡ���ָ���Java����
	public static void method2() {
		try {
			//���������л�����
			ObjectInputStream in = new ObjectInputStream(
										new FileInputStream("D:\\iotest\\1.txt"));
			//��ʼ�����л�
			Object obj = in.readObject();
			System.out.println(obj);//Student [name=ƤƤϼ, age=22]
			//�ͷ���Դ
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//���л�����Java���� ��� �����ñ��浽������
	public static void method() {
		try {
			Student s = new Student("ƤƤϼ",22);
			//�������л�����
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\iotest\\1.txt")) ;
			//��ʼ���л�
			out.writeObject(s);
			//�ͷ���Դ
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
//����Student
//1���������ļ�����Ҫ֧�����л�������ʵ��Serializable�ӿڣ����ǿ��������л�����
//����java.io.NotSerializableException: cn.tedu.io.Student
class Student implements Serializable{
	
	//2���Զ����ɱ��ļ���һ��Ψһ��ʶ���汾��id
	private static final long serialVersionUID = 1L;
	
	//���췽��
	public Student() {}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private String name ;
	private int age ;
	//set() get()
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	//toString()
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}






