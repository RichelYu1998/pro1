package cn.tedu.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//�ͻ��˸�������������һ�����ݣ����������յ��󣬰����������ٷ��ظ��ͻ���
public class Server2 {
    public static void main(String[] args) throws IOException {
        //1������������
        ServerSocket s = new ServerSocket(8888);
        //2����ȡ�ͻ��˵����ӣ�������ͨ��ͨ��
        Socket ss = s.accept();
        //3������socket��ȡ  ˫����ֽ���
        InputStream in = ss.getInputStream();
        OutputStream out = ss.getOutputStream();

        //4�����ֽڵĶ�д�� ת�� �ַ���д����
        // BufferedReader/PrintWriter���ж�д�Ľ��������
        BufferedReader in2 = new BufferedReader(new InputStreamReader(in)) ;
        PrintWriter out2 = new PrintWriter(new OutputStreamWriter(out)) ;

        //5����ͻ���д�� һ������
        String input = new Scanner(System.in).nextLine();
        out2.println(input);//д������
        out2.flush();//ˢ��

    }
}
