package cn.tedu.constructor;
//�������������  �����
//1�����������ص㣺�ڴ������췽��ǰ��ȥִ�й�������  +  ������ȡ���췽���Ĺ���  +  λ�����ڳ�Աλ��
//2���ֲ�������ص㣺�����˷���   +  �������Ʊ��������÷�Χ   + λ�����ڷ�����
//3��ִ��˳�򣺴�������ʱ���ȴ������������ٴ������췽�������÷����󣬴����ֲ�����顣��������>���췽��>�ֲ������
public class Test4_Block {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		Teacher t2 = new Teacher(20);
		Teacher t3 = new Teacher("����ɽ");
		//2�� ÿ��  ��������ʱ  �������Զ����ù��췽�������ǣ�ÿ�ε��ù��췽��ǰ������ȥ���ù������顣
		//3��һ�����ȼ��ع��� �����   �ټ���  ���췽����
		t.show();//7������show()����ִ�оֲ������
	}
}
class Teacher {
	String country ;//5���������й��췽������Ҫʹ����ͬ�ı���country��������Ҫ��country������һ����Ա������������������Ч
	//1���������飺λ���������﷽����
	{
		country ="�й���" ;  //4����������  ר��  ����  ��ȡ���� ���췽���Ĺ��ԣ���
		System.out.println("��������");
	}
	public Teacher() {
		System.out.println("�޲ι���"+country);
	}
	public Teacher(int a) {
		System.out.println("���ι���" + a + country);
	}
	public Teacher(String n) {
		System.out.println("���ι���" + n + country);
	}
	//6���ֲ�����飺λ�����ڷ������Ҫִ�У������ȴ��������� + ���� ���Ʊ��������÷�Χ(ֻ�ھֲ����������Ч)
	public void show() {
		{
			int sum  =  10 ;
			System.out.println("�ֲ������");
			System.out.println(sum);
		}
	}
}
