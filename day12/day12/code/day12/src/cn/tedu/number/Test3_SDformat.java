package cn.tedu.number;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//�������������  �������
public class Test3_SDformat {
	public static void main(String[] args) throws Exception {
//		1�������û�����ĳ�������(String����)
		String birthday = new Scanner(System.in).nextLine() ; 
		
//		2����String���͵�����  ת��  Date����(��Ҫ������SimpleDateFormat)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(birthday) ;
		
//		3����ȡ����ʱ�ĺ���ֵ(getTime)  
		long birth = date.getTime() ;
//		4����ȡ��ǰ�ĺ���ֵ 
		long now = System.currentTimeMillis() ;
//		5�����ʱ���(������졣ms) 
		System.out.println(  (now-birth)/1000/60/60/24    ) ;
		
	}
}
