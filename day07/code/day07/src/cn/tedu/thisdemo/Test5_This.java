package cn.tedu.thisdemo;

//�������������  this�ؼ���
public class Test5_This {	
	public static void main(String[] args) {
		//4���޲δ�������  -- �Զ�����  �޲ι���
		new Demo() ;
		//6�����δ�������  -- �Զ�����  ���ι���
		new Demo(88);
	}
}
//����Demo
class Demo{
	//���췽��
	public Demo() {
		//3�����޲ι�����   ʹ��  ���ι���  �Ĺ���
//		this(100);
		System.out.println("�޲ι���");
	}
	public Demo(int age) {
		//5���ں��ι�����   ʹ��  �޲ι���  �Ĺ���
		this();//7��this�ؼ��֣�ʹ���ڹ��췽����ʱ�������ǵ�һ����䣡����
		System.out.println("���ι���"+age);
	}
	
	int sum = 20 ; 
	int count = 30 ; 
	
	public void show() {
		int count = 10 ; 
		System.out.println(count);//10�������ľͽ�ԭ��
		System.out.println(sum);//20
		
		//1��this������ʾ�����������ã��൱�ڵײ���Զ������������Demo this = new Demo(); 
		//2�����ֲ�������  ��  ��Ա������ͬ�� ʱ������ͨ��this�����ó�Ա�������������һֱʹ�þֲ�������
		System.out.println( this.count  );  //30 
	}
}


