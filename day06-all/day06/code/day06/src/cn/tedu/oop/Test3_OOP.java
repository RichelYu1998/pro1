package cn.tedu.oop;

//�������� ���� ��Ͷ���Ĵ���
//һ��.javaԴ�ļ��У����԰�������ࡣ���ǣ�ֻ����һ���౻public���Σ��������public�����������ļ�����
public class Test3_OOP {
	public static void main(String[] args) {
		Phone p = new Phone() ; 
		p.call();
		p.message();
		p.music();
		p.color = "red" ;
		p.size = 5.7;
		p.pinpai = "HUAWEI" ;
		p.price = 5899.8  ;
		System.out.println( p.color  );
		System.out.println( p.size  );
		System.out.println( p.pinpai  );
		System.out.println( p.price  );
	}
}
// 1��ͨ��class�����ֻ��� �����ֻ�������ǳ���ģ��������Ϊ���ͼֽ
class Phone {
	String color; // ��ɫ
	double size; // �ߴ�
	String pinpai; // Ʒ��
	double price; // �۸�
	// 3�� ��Ϊ����Ա����
	// ��绰
	public void call() {
		System.out.println("call()...");
	}
	// ������
	public void message() {
		System.out.println("message()...");
	}
	// ������
	public void music() {
		System.out.println("music()...");
	}
}
