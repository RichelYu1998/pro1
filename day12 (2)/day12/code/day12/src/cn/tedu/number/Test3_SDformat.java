package cn.tedu.number;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//这个类用来测试  存活天数
public class Test3_SDformat {
	public static void main(String[] args) throws Exception {
//		1、接收用户输入的出生日期(String类型)
		String birthday = new Scanner(System.in).nextLine() ; 
		
//		2、把String类型的日期  转成  Date类型(需要工具类SimpleDateFormat)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(birthday) ;
		
//		3、获取出生时的毫秒值(getTime)  
		long birth = date.getTime() ;
//		4、获取当前的毫秒值 
		long now = System.currentTimeMillis() ;
//		5、输出时间差(换算成天。ms) 
		System.out.println(  (now-birth)/1000/60/60/24    ) ;
		
	}
}
