package cn.tedu.oop;

//������������� �̳е� ���Ű���
public class Test1_Extends {
	public static void main(String[] args) {
		//��������������
		Father f = new Father(); f.sleep();
		f.eat();
		System.out.println( f.skin );
		System.out.println( f.country );
		//3�� ��������������
		Son s = new Son();
		//ֱ��ʹ���˰ְ���Ĺ��ܣ���
		s.eat();
		System.out.println( s.skin );
		System.out.println( s.country );
//		System.out.println(s.sifangmoney);//5.1���Ǹ����˽�г�Ա�����࿴�������ò���
		//ֱ��ʹ����үү��Ĺ��ܣ���
		s.sleep();
	}
}
//7���̳п��Դ���
class Yeye{
	public void sleep() {
		System.out.println("Yeye...sleep()");
	}
}
//��������
class Father extends Yeye {
	//5�������˽�г�Ա  ���� �޷� �̳�
	private  double sifangmoney = 100 ;
	String skin ="������" ; 
	String country = "�й�"; 
	
	public void eat() {
		System.out.println("Father...eat()");
	}
}
//1���������࣬ͨ��extends�ؼ��ֱ�ʾ�̳�
//4��javaֻ֧�ֵ��̳�
class Son extends Father{//6���̳еĹ�ϵ��is a�Ĺ�ϵ��ǿ��Ҫ��������� �̳и��࣬����һ������ -- ǿ����ԣ���
	//2���൱������Ѹ���Ĺ���  ͨͨ���ƹ�����
}

