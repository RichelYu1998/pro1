package cn.tedu.api;

import java.util.Arrays;

//这个类用来测试 字符串：字符串底层维护了一个char[]
public class Test2_String {
	public static void main(String[] args) {
		//1、创建对象
		char[] cs = new char[] {'a','b','c'};
		String s = new String(cs) ; // 触发了含参构造，对象存在堆内存中
		String s2 = "abc" ;//简写，对象存在 堆内存中的常量池中。常量池高效。相同数据只会存一次。
		//2、常用方法
		System.out.println(  s.charAt(1)  );  //  获取指定下标对应的字符 
		System.out.println(  s.concat("opq")  );// 在原有数据的末尾处 拼接指定字符串
		System.out.println(  s.contains("bc")  );// 判断是否包含指定的字符串
		System.out.println(  s.endsWith("c") );// 判断是否以指定的字符串结尾
		System.out.println(  s.equals("abc") );// 判断是否和指定的字符串  相等
		System.out.println(  s.hashCode() ); // 获取 字符串在内存中的哈希码值
		System.out.println(  s.isEmpty() );	// 判断字符串 是否为空
		System.out.println(  s.length() );   //获取字符串的长度
		
		s =  "abcdefa" ; //修改s的值
		System.out.println(  s.indexOf("a") +"======");// 获取 指定字符串  第一次出现的下标值
		System.out.println(  s.lastIndexOf("a") );// 获取 指定字符串 最后一次出现的下标值
		System.out.println(  s.replace('a','1') );//替换字符
		System.out.println(  s.startsWith("ab") );// 判断是否以指定的前缀开始
		System.out.println(  s.substring(1) ); // 从指定下标处 开始截取字符串
		System.out.println(  s.substring(1,5) );//从指定位置开始，到指定位置结束 截取字符串 [1,5)，含头不含尾
		System.out.println(  s.toLowerCase() );//把字符串全转小写
		System.out.println(  s.toUpperCase() );//把字符串全转大写
		
		s = "    a  c  123     " ; 
		System.out.println(  s.trim() );  //删除前面和后面的多余空格
		
		String num = String.valueOf(123);//把各种其他类型的数据转成String类型
		
		s =  "123.abc.xyz" ;
		//java中有一些特殊的符号 | ？  ， 。  .  如果程序没有正确的解析时，你需要转义  \\
		String[] strs = s.split("\\.") ;//按照指定的字符串切割
		System.out.println( Arrays.toString(strs)  );//[123, abc, xyz]
		
		char[] cs2 = s.toCharArray() ;
		System.out.println( Arrays.toString(cs2)  );//[1, 2, 3, ., a, b, c, ., x, y, z]
	}
}



