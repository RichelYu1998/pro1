package cn.tedu.number;

import java.io.File;
import java.util.Scanner;

//������������� �ݹ�
public class Test6_Digui {
	public static void main(String[] args) {
		//1�������û�������ļ���·��
		String path = new Scanner(System.in).nextLine();
		//2����װ��File����
		File dir = new File(path);
		//3������size()���ܴ�С
		del(dir) ;
	}
	//4������size()���ܴ�С
	public static void del(File dir) {
//		1���г��ļ������������Դ
		File[] files = dir.listFiles() ;
		
//		2���õ�ÿ����Դ����ʼ�ж�
		for (int i = 0; i < files.length; i++) {
			
			File file = files[i] ; //file��ʾ��ǰ��ȡ������Դ
			if(  file.isFile()  ) {//���ļ�
//		3���жϣ�������ļ���ֱ��ɾ��
				file.delete(); 
			}else if( file.isDirectory()  ) {//���ļ���
//		4���жϣ�������ļ��У���ʼ�ظ��ĸ�   1   2   3  4  �⼸��������
				del(file) ;//�ݹ飬��Ϊҵ��ʼ��size����һ����
			}
		}
		dir.delete() ; //ɾ�����ļ���
	}




}
