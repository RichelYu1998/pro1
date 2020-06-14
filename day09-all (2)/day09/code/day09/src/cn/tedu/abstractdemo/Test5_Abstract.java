package cn.tedu.abstractdemo;

//������������� ������
public class Test5_Abstract {
	public static void main(String[] args) {
		// ������̬�������
		Animal an = new Dog();
		an.eat();
		an.play();
	}
}
// 2�����һ�����У������˳��󷽷� �����������ǳ�����
// 3����������һ������� �� �������� �������� ���԰��� ���󷽷�
abstract class Animal {
	// 1���������û�з����壬���ǳ��󷽷���ʹ��abstract�ؼ���
	abstract public void eat();

	public void play() {
		System.out.println("Animal...play()");
	}
}
// 4������ ��� �̳��� ����ĸ��� ����������·�������г��󷽷�����д ���� ��һ����������ࡣ
// abstract class Dog extends Animal{
class Dog extends Animal {
	//5����д���󷽷�
	public void eat() {
		System.out.println("������");
	}
}
