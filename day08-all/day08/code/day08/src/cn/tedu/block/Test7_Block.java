package cn.tedu.block;

//�������� ���Դ����
//TODO �ܽ᣺���� + �����ڵ�  
public class Test7_Block {
	public static void main(String[] args) {
		// ����
		Student  s = new Student();
		s.show();
		Student  s2 = new Student();
	}
}
//����Student��
class Student{
	//1���ṩ��̬����飺λ�����ڳ�Աλ�� +  ֻ�����һ�� + ���ص���
	static {
		System.out.println("��̬ �����");
	}
	//�ṩ�������飺λ�����ڳ�Աλ��
	{
		System.out.println("����  ����� ");
	}
	//�ṩ���췽��
	public Student() {
		System.out.println("���췽��");
	}
	//�ṩ�ֲ������
	public void show() {
		{
			System.out.println("�ֲ� �����");
		}
	}
	
}

