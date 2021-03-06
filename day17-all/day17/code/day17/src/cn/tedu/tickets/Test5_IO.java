package cn.tedu.tickets;

import java.io.*;

//读取一行写出一行
public class Test5_IO {
    public static void main(String[] args) throws IOException {
        //1、创建读取流对象，负责一行一行读取
        BufferedReader in = new BufferedReader(
                new FileReader("D:\\iotest\\1.txt"));

        //2、创建写出流对象，负责一行一行写出
        PrintWriter out = new PrintWriter(
                    new FileWriter("D:\\iotest\\22.txt") ) ;

        //3、读一行写一行
        String line;//保存读取到的一行数据，readLine()如果没有读取到就是null
        while ( ( line = in.readLine() )  != null ){
            //println()把读取到的数据line一行一行写出
            out.println(line);
        }

        //4、释放资源
        in.close();
        out.close();
    }
}
