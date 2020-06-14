package cn.tedu.number;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//�������������  File 
public class Test5_File {
	public static void main(String[] args) throws IOException {
		//1������File����  --  �������ļ�·�������ļ���·��
		File f = new File("D:\\iotest\\1.txt");//��װһ���ļ�·��
		//2����������
		//�ļ��ļ�������
		System.out.println(  f.length()  );//��ȡ�ļ����ֽ���
		System.out.println(  f.exists()  );//�ж��ļ��Ƿ����
		System.out.println(  f.isFile()  );//�ж���һ���ļ�
		System.out.println(  f.isDirectory()  );//�ж���һ���ļ���
		System.out.println(  f.getName()  );//��ȡ�ļ�����
		System.out.println(  f.getParent()  );//��ȡ��Ŀ¼
		System.out.println(  f.getAbsolutePath()  );//��ȡ����·��
		//����  ɾ��
		System.out.println(  f.createNewFile()  );//�Ƿ�ɹ����½����ļ�
		
		f = new File("D:\\iotest\\m"); //��װһ���ļ���·��
		System.out.println(  f.mkdir()  );//�Զ�����һ�������ڵ�Ŀ¼
		
		f = new File("D:\\iotest\\x\\y\\z"); //��װһ���ļ���·��
		System.out.println(  f.mkdirs()  );//�Զ������༶�����ڵ�Ŀ¼
		
		f = new File("D:\\iotest\\2.txt"); 
		System.out.println(  f.delete()  );//ɾ���ļ� ��  ���ļ���
		
		//�б�
		f = new File("D:\\iotest");  //��װһ���ļ���·��
		String[] strs = f.list() ;//��ȡ�ļ���������������
		System.out.println(Arrays.toString(strs));
		
		File[] files = f.listFiles() ;//��ȡÿ���ļ�����װ��File�������������
		System.out.println(Arrays.toString(files));
		
	}
}	
