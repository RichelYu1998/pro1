package cn.tedu.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//客户端给服务器发送来一行数据，服务器接收到后，把这行数据再返回给客户端
public class Server2 {
    public static void main(String[] args) throws IOException {
        //1、启动服务器
        ServerSocket s = new ServerSocket(8888);
        //2、获取客户端的连接，并建立通信通道
        Socket ss = s.accept();
        //3、根据socket获取  双向的字节流
        InputStream in = ss.getInputStream();
        OutputStream out = ss.getOutputStream();

        //4、把字节的读写流 转成 字符读写流。
        // BufferedReader/PrintWriter按行读写的解决方案。
        BufferedReader in2 = new BufferedReader(new InputStreamReader(in)) ;
        PrintWriter out2 = new PrintWriter(new OutputStreamWriter(out)) ;

        //5、向客户端写出 一行数据
        String input = new Scanner(System.in).nextLine();
        out2.println(input);//写出后换行
        out2.flush();//刷新

    }
}
