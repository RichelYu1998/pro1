package cn.tedu.bubble;

import java.io.*;

//这个类用来测试IO释放资源
public class Test2_IO {
    public static void main(String[] args) {
//        method();//jdk7.0前
        method2();//jdk7.0后
    }
    //jdk7.0后--try with resources
    private static void method2() {
        try(
            //读取资源
            InputStream in = new BufferedInputStream ( new FileInputStream("D:\\iotest\\1.txt")  );
            //写出资源
            OutputStream out = new BufferedOutputStream (  new FileOutputStream("D:\\iotest\\2.txt")   );
           ) {
             //边读边写
            int b;//记录读取到的数据
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //jdk7.0前
    private static void method() {
        //因为finally里已经变量的作用范围，所以需要把变量的作用范围扩大。
        InputStream in = null;
        OutputStream out = null;
        try {
            //读取资源
            in = new FileInputStream("D:\\iotest\\1.txt");
            //写出资源
            out = new FileOutputStream("D:\\iotest\\2.txt");
            //边读边写
            int b;//记录读取到的数据
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {//我有  必须要  执行的代码。
            //释放资源  --  怎么保证资源一定会被释放！！！
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
