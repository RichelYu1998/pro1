package cn.tedu.net;

import java.io.*;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws IOException {
        //1、连接指定的服务器
        Socket s = new Socket("127.0.0.1", 8888);
        //2、根据socket获取 双向的字节流
        OutputStream out = s.getOutputStream();
        InputStream in = s.getInputStream();
        //3、把字节的读写流 转成 字符读写流。
        // BufferedReader/PrintWriter按行读写的解决方案。
        BufferedReader in2 = new BufferedReader(new InputStreamReader(in));
        PrintWriter out2 = new PrintWriter(new OutputStreamWriter(out));

        //4、读取，服务器发回来的数据
        String line = in2.readLine();//读一行，如果没数据，readLine()返回null
        System.out.println(line);

    }
}
