package cn.tedu.oop;
//�������������  �̳е�  �����취ʹ��
public class Test4_UseExtends {
	static public  void main(String[] args) {
		//�����������
		Zi3 zi = new Zi3() ;
	}
}
//��������
class Fu3{
	public Fu3( ) { } // 3�����飬�޲ι��췽��  ��ʱ�ṩ
	public Fu3(int a) {
		System.out.println("���� ���췽��");
	}
}
//��������
class Zi3 extends Fu3{
//	public Fu3( ) { }   //  5�����췽�����ܱ��̳У����﷨�Ͳ��ԣ���
	public Zi3() {
		//1��������޲ι����У�Ĭ�Ͼʹ���super()���Զ��Ҹ���� �޲ι���
		super() ;
		//2������������У������������޲ι�����  --ֻ�ܵ��ø���  �� ���ι��� 
//		super(100) ;
		//4��super�ؼ���ʹ��  ��  ���췽����  ʱ��������һ����䣡��������this
		System.out.println("���� ���췽��");
	}
}