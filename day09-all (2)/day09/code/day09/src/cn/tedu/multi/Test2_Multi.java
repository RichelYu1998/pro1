package cn.tedu.multi;

//�������� ����  ��̬ 
public class Test2_Multi {
	public static void main(String[] args) {
		//��������������
		Dog d = new Dog();  
		d.eat();   //������
		//������̬�������
		Animal a = new  Dog() ;  //�ھ�1����������  ָ�� ������󣬶�̬  / ����ת�� 
		a.eat()  ; // �ھ�2�����뿴��ߣ����п��ұ�
		//2�����뿴��ߣ���˼�� ��Ҫ����ɹ� ����  ʹ�� ���Ҳ���Ǹ��� �ṩ�Ĺ��ܣ�����
		//3�����п��ұߣ� ��˼��   ���յ�ִ�н�� ������� ʵ��Ϊ׼����
		//4����̬�ĺô���������ͳһ���õı�׼��������׼���Ǹ��࣡�������������û�ṩ�Ͳ����ã���
	}
}
//1����̬ǰ�᣺�̳� + ��д
class Animal{
	public void eat() {
		System.out.println("��ɶ����") ;
	}
}
class Dog extends Animal{
	//������д
	public void eat() {
		System.out.println("������");
	}
}
