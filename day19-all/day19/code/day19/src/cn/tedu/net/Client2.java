package cn.tedu.net;

import java.io.*;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws IOException {
        //1������ָ���ķ�����
        Socket s = new Socket("127.0.0.1", 8888);
        //2������socket��ȡ ˫����ֽ���
        OutputStream out = s.getOutputStream();
        InputStream in = s.getInputStream();
        //3�����ֽڵĶ�д�� ת�� �ַ���д����
        // BufferedReader/PrintWriter���ж�д�Ľ��������
        BufferedReader in2 = new BufferedReader(new InputStreamReader(in));
        PrintWriter out2 = new PrintWriter(new OutputStreamWriter(out));

        //4����ȡ��������������������
        String line = in2.readLine();//��һ�У����û���ݣ�readLine()����null
        System.out.println(line);

    }
}
