package cn.tedu.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//这个类用来测试  网络通信客户端
//客户端：
// 负责接收服务器发回来的数据
//并给服务器发送数据
public class Client {
    public static void main(String[] args) throws IOException {
        //1、尝试连接服务器 -- 同时指定服务器的ip和端口号
        //127.0.0.1是本机的ip地址。工作中，要写真实的服务器的ip地址
        Socket socket =
               new Socket("127.0.0.1",8000);

        //2、给服务器发送数据--对客户端是out,对服务器是in
        OutputStream out = socket.getOutputStream();
        out.write("hello".getBytes());//参数是为了把字符串转成byte[]
        out.flush();//刷出去

        //TODO 3、读取服务器发回来的数据
        InputStream in = socket.getInputStream();
        for (int i = 0; i < 5; i++) {
            //把read()返回值从int转成char类型
            char c = (char) in.read();
            System.out.print(c);//同行展示
        }

    }
}
