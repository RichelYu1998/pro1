package cn.tedu.fordemo;

//�������������  for
//for( ��ʼλ�� ; ѭ������ ; ��������   ){   ѭ����  }
public class Test1_For {
	public static void main(String[] args) {
//		��ӡ10��0
		for( int i = 10  ;  i >= 0  ;  i--  ){   
//			System.out.println(i);//��ӡ����չʾ
			System.out.print(i);//��ͬ��չʾ
		}
		
		System.out.println();//����
		
//		��ӡ8,88,888,8888,
		for( int i = 8 ; i <= 8888 ; i=i*10+8   ){  
			System.out.print( i+"," ); 
		}
		
		
		
		
	}
}
