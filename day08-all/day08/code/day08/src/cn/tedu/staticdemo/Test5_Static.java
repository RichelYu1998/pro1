package cn.tedu.staticdemo;
//������������� ��̬
public class Test5_Static {
	public static void main(String[] args) {
		//2����̬��Դ ����  ʹ�þ�̬��ʽ���ʣ�ֱ�ӱ���������
		//3����̬��Դ  ������  ������ء�û�ж���ʱ����̬��ԴҲ���һʱ����ؽ��ڴ档
		Person.study();
		//�����������
		Person  p = new Person();
		p.name =  "�ܴ�";
		p.study();
		p.coding();
		System.out.println( p.name  );
		System.out.println( p.age  );
		//4����̬��Դ  �ǹ�����Դ ���ڶ���������Թ���
		Person  p1 = new Person();
		System.out.println( p1.name );//�ܴ�
		//5��static���ܺ�this����super���ã���Ϊ����staticʱ���ܻ�û�ж�����
	}
}
//����Person��
class Person{
	//�ṩ��ͨ�� ��Ա����  ��Ա����
	//1��static �������γ�Ա����  ���� ��Ա����
	static String name ; 
	int age ;
	
	static public  void  study() {
		System.out.println("����ѧϰjava");
	}
	public void coding() {
		System.out.println("�����ô���");
	}
}
