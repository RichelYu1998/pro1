package cn.tedu.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//�������������  ����ͨ�ŷ�������
//�������ˣ�
// ������տͻ��˷�������������
// �����ͻ���������Ӧ
//����
//�������˽��տͻ��˷�����hello
//�����ͻ�����Ӧworld
public class Server {
    public static void main(String[] args) throws IOException {
        //1������������--��ָ��8000�˿ںŵ�λ�ã��ȴ��ͻ���������
        //�˿ںŰ�����0~65535������0~1024��ϵͳռ��
        ServerSocket server = new ServerSocket(8000);
        System.out.println("��������������");
        //2�����տͻ��˷�������������--�������������ӵ�ͨ��
        //�������� --- һֱ���ȿͻ��˵�����
        Socket socket = server.accept();
        System.out.println("��ͻ������ӳɹ���");
        //3����ȡ�ͻ��˷���������
        InputStream in = socket.getInputStream();
        for (int i = 0; i < 5; i++) {
           int b =  in.read() ;
           char c = (char) b ;//���ȡ�ַ�����
           System.out.print(c);//ͬ��չʾ
        }

        //TODO 4�����������ͻ��˷�������
        OutputStream out = socket.getOutputStream();
        out.write("world".getBytes());
        out.flush();

    }
}
