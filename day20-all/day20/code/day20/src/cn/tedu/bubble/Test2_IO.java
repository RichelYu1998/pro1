package cn.tedu.bubble;

import java.io.*;

//�������������IO�ͷ���Դ
public class Test2_IO {
    public static void main(String[] args) {
//        method();//jdk7.0ǰ
        method2();//jdk7.0��
    }
    //jdk7.0��--try with resources
    private static void method2() {
        try(
            //��ȡ��Դ
            InputStream in = new BufferedInputStream ( new FileInputStream("D:\\iotest\\1.txt")  );
            //д����Դ
            OutputStream out = new BufferedOutputStream (  new FileOutputStream("D:\\iotest\\2.txt")   );
           ) {
             //�߶���д
            int b;//��¼��ȡ��������
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //jdk7.0ǰ
    private static void method() {
        //��Ϊfinally���Ѿ����������÷�Χ��������Ҫ�ѱ��������÷�Χ����
        InputStream in = null;
        OutputStream out = null;
        try {
            //��ȡ��Դ
            in = new FileInputStream("D:\\iotest\\1.txt");
            //д����Դ
            out = new FileOutputStream("D:\\iotest\\2.txt");
            //�߶���д
            int b;//��¼��ȡ��������
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {//����  ����Ҫ  ִ�еĴ��롣
            //�ͷ���Դ  --  ��ô��֤��Դһ���ᱻ�ͷţ�����
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
