package cn.tedu.fordemo;
//������������� Ƕ��for����ϰ
public class Test3_For2 {
	public static void main(String[] args) {
//��ӡ��ֱ��������
		//��һ��ѭ��ʱ��i=1ʱ����ѭ���� j = 1; j <= 1;��ʱj��ȡֵ��Χ����=1��          ��ӡ*�����С�i�������2
		//�ڶ���ѭ��ʱ��i=2ʱ����ѭ���� j = 1; j <= 2;��ʱj��ȡֵ��Χ����=1 2��       ��ӡ**�����С�i�������3
		//������ѭ��ʱ��i=3ʱ����ѭ���� j = 1; j <= 3;��ʱj��ȡֵ��Χ����=1 2 3��    ��ӡ***�����С�i�������4
		//���Ĵ�ѭ��ʱ��i=4ʱ����ѭ���� j = 1; j <= 4;��ʱj��ȡֵ��Χ����=1 2 3 4�� ��ӡ****�����С�i�������5
		//�����ѭ��ʱ��i=5ʱ����ѭ���� j = 1; j <= 5;��ʱj��ȡֵ��Χ����=1 2 3 4 5����ӡ*****�����С�i�������6 
		for(int i = 1 ; i <=5 ; i++) {//��ѭ�������У�ִ��5�Σ���ӡ5��
			for(int j = 1; j <= i ; j++) {//��ѭ�������С������ǣ��������̶�����Ҫ������i�ı�
				System.out.print("*");//ͬ��չʾ
			}
			System.out.println();//����
		}
		
//	��ӡ99�˷���
		for(int i = 1 ; i <=9 ; i++) {//��ѭ�������У�ִ��9�Σ���ӡ9��
			for(int j = 1; j <= i ; j++) {//��ѭ�������С������ǣ��������̶�����Ҫ������i�ı�
//				System.out.print("3*2=6");//ͬ��չʾ
//				System.out.print("��*��=��");//ͬ��չʾ
//				System.out.print("i*j=i*j");//ͬ��չʾ
				System.out.print(i+"*"+j+"="+i*j+"	");//ͬ��չʾ
			}
			System.out.println();//����
		}
		
	}
}