package cn.tedu.ifdemo;

//�������������  ����ƥ��
//���˽⼴�ɣ���
public class Test7_Switch {
	public static void main(String[] args) {
		int a = 2 ;
		//1������a�൱�ڰ�����2���ݳɹ�
		switch ( a  )  {//0�����ͱ��ʽ��������������Ҫ��byte short int char jdk1.7��String
			//2����ʼƥ��������
			case '0' : System.out.println(0); break ;
			case 1 :System.out.println(1); break ;
			//3���ɹ�ƥ��������2������������͸����case������default
			case 2: System.out.println(2);  break ;  //4��break������������
			case 3: System.out.println(3); break ;
			case 4: System.out.println(4); break ;
			
			default : System.out.println(99);
		}
		
	}
}
