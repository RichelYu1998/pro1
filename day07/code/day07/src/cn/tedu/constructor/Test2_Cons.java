package cn.tedu.constructor;

//������������� ���췽�� ר��������������
//�ܽ�1�������Ǵ�������ʱ�����Զ�ƥ�乹�췽�������췽���������ء�
public class Test2_Cons {
	public static void main(String[] args) {
		//1���޲η�ʽ�������� --- ���Զ�����  �޲ι��췽����
		Person p = new Person() ;//���Զ�����  �޲ι��췽��
		//4����������   -- ����  ���ι���
		Person p2 = new Person("��үү");//���Զ����� String���췽��
		Person p3 = new Person(20);//���Զ����� int���췽��
		Person p4 = new Person("����ɽ",85);//���Զ����� String,int���췽��
	}
}
//����Person��   //���η� ����([�����б�]){ ������  }
class Person{
	//2���޲� ���췽��   ��Ĭ�ϴ��ڵģ�  ǰ���ǣ�������У�ֻ�ṩ�˺��ι��죬��ʱ�޲ι�������û���ˣ�����
	public Person() {   }
	//3���ṩ������ʽ�Ĺ��췽������������ͬ+�����б�ͬ
	public Person(String name) {
		System.out.println("���ι��췽��"+name);
	}
	//������ʽ�Ĺ��췽��
	public Person(int age) {
		System.out.println("���ι��췽��"+age);
	}
	public Person(String name,int age) {
		System.out.println("���ι��췽��"+name+age);
	}
	
}




