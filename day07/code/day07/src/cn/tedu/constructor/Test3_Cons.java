package cn.tedu.constructor;
//������������� ���췽�� ����Ա������ֵ
//�ܽ�1�� �ڴ�������ʱ�����Ժ��εķ�ʽ��������ͬʱ�Ѳ����ᴫ�ݸ����췽�������췽���õ�ֵ�͸���Ա����ֱ�Ӹ�ֵ��
public class Test3_Cons {
	public static void main(String[] args) {
		Animal a = new Animal() ; //���Զ����� �޲ι���
		Animal a2 = new Animal(3) ; //���Զ����� ���ι���
		
	}
}
class Animal{
	private int age ; 
	
	//Ĭ�Ͼͻ����  �޲�  ���� ����
	public Animal( ) {    }
	
	public Animal(int a) {
		age = a ;//��������ʱ�����ݹ����Ĳ�����������a���档a�õ�ֵ������Ա����age��ֵ��
		System.out.println(age);
	}
	
}
