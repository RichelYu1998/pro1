package cn.tedu.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//这个类用来测试  网络通信服务器端
//服务器端：
// 负责接收客户端发来的连接请求
// 并给客户端做出响应
//需求：
//服务器端接收客户端发来的hello
//并给客户端响应world
public class Server {
    public static void main(String[] args) throws IOException {
        //1、启动服务器--是指在8000端口号的位置，等待客户端来连接
        //端口号包含：0~65535，其中0~1024被系统占用
        ServerSocket server = new ServerSocket(8000);
        System.out.println("服务器已启动！");
        //2、接收客户端发来的连接请求--并建立数据连接的通道
        //阻塞方法 --- 一直死等客户端的连接
        Socket socket = server.accept();
        System.out.println("与客户端连接成功！");
        //3、读取客户端发来的数据
        InputStream in = socket.getInputStream();
        for (int i = 0; i < 5; i++) {
           int b =  in.read() ;
           char c = (char) b ;//想读取字符本身
           System.out.print(c);//同行展示
        }

        //TODO 4、服务器给客户端返回数据
        OutputStream out = socket.getOutputStream();
        out.write("world".getBytes());
        out.flush();

    }
}
