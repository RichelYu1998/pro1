package cn.tedu.finaldemo;
//�������������   final�ؼ���
public class Test1_Final {
	public static void main(String[] args) {
		Erzi erzi = new Erzi();
//		erzi.name = "��" ;    //3.1�������Ѿ���final�ˣ�ֵ���ܸģ�ֻ�����ã�����
		System.out.println(erzi.NAME);
		System.out.println( BaBa.NAME );
	}
}
//��������
//final class BaBa{//1�����౻final���κ󣬱�������յ��࣬���ܱ��̳С�The type Erzi cannot subclass the final class BaBa
class BaBa{
	//2����������final���κ󣬾ͳ��˳�����ֵ���ܱ��޸ġ�The final field BaBa.name cannot be assigned
	//4��������һ�㶼�Ǵ�д�ġ�Ϊ����緽����ã�ͨ��Ҳ�ᱻstatic���Ρ�
	static final String NAME = "��" ;
	//3����������final���κ󣬾ͳ������շ��������ܱ���д��Cannot override the final method from BaBa
	final public void study() {
		System.out.println("׬Ǯ����");
	}
}
//��������
class Erzi extends BaBa{
	//������д�����������͸���һģһ��
//	public void study() {
//		System.out.println("�Ȱ�java");
//	}
}






