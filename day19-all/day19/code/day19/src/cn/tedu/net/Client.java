package cn.tedu.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//�������������  ����ͨ�ſͻ���
//�ͻ��ˣ�
// ������շ�����������������
//������������������
public class Client {
    public static void main(String[] args) throws IOException {
        //1���������ӷ����� -- ͬʱָ����������ip�Ͷ˿ں�
        //127.0.0.1�Ǳ�����ip��ַ�������У�Ҫд��ʵ�ķ�������ip��ַ
        Socket socket =
               new Socket("127.0.0.1",8000);

        //2������������������--�Կͻ�����out,�Է�������in
        OutputStream out = socket.getOutputStream();
        out.write("hello".getBytes());//������Ϊ�˰��ַ���ת��byte[]
        out.flush();//ˢ��ȥ

        //TODO 3����ȡ������������������
        InputStream in = socket.getInputStream();
        for (int i = 0; i < 5; i++) {
            //��read()����ֵ��intת��char����
            char c = (char) in.read();
            System.out.print(c);//ͬ��չʾ
        }

    }
}
