package cn.tedu.staticdemo;
//������������� ��̬ �ĵ���
//�ܽ�1�� ��ͨ��Դ��ô���ö����ԡ� ��̬��Դ  ֻ�� ���þ�̬��Դ��
public class Test6_Static {
	public static void main(String[] args) {
		//�����������
		Person2 p = new Person2(); p.eat();
	}
}
//����Person2��
class Person2{
	//1����ͨ��Դ   �ܲ���  ����  ��̬��Դ  ��   ---  ���ԣ���
	String name;
	public void eat() {
		game();
		System.out.println( age );
	}
	//2����̬��Դ  �ܲ��� ����  ��ͨ��Դ  ��  ---  �����ԣ���ֻ̬�ܵ���̬
	static int age ;  
	static public void game() {
//		System.out.println( name  );
	}
}
