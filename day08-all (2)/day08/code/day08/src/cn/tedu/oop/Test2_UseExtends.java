package cn.tedu.oop;

//�������������  �̳е�  ����ʹ��
public class Test2_UseExtends {
	public static void main(String[] args) {
		//�����������
		Zi zi = new Zi();
		zi.show();
	}
}
//��������
class Fu{
	int sum = 10 ;
	int count = 30 ; 
}
//��������
class Zi extends Fu{
	int count = 20 ; 
	
	public void show() {
		int count = 10 ; 
		System.out.println(count);//10   ��ʹ���˾ֲ�����
		System.out.println( this.count ); //20��ʹ���˳�Ա����������Ա�����;ֲ�����ͬ��ʱ�����ó�Ա������ͨ��this����
		
		//1����Ҫ�������У�ʹ�ø����sum   -- ����ֱ���ã�
		System.out.println(  super.sum  );
		//2����Ҫ�������У�ʹ�ø����count   -- �����Ѿ�������ı�����ͬ���ˣ�������ø���ģ�����super
		//3��super�ؼ��֣�������ʾ�����������á�������������ʹ�ø��๦�ܡ�
		System.out.println( super.count  );//30��ʹ���˸������
	}
}
