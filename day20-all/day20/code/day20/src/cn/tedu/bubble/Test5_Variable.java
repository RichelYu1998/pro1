package cn.tedu.bubble;

import java.util.Arrays;

//������������� jdk������ -- �ɱ�������������õ���Class�����������֣���
public class Test5_Variable {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1,2,3,4,5);
    }
    //�Ƿ�������ͬ�����ǲ����б�ͬ�ķ���  --  �з���������  --  ���ֵ�Ŀ������߳���������
    //1��...���ǿɱ���������֣������˲����ĸ���  ʡ�Բ��ܡ�
    private static void add(int b,int...a) {//3���ɱ���������ǲ����б��е����һ��
        //2���ɱ������Ϊʲô���뼸������  a�����أ�---������a������  --  [I@1b6d3586
        System.out.println(a);
        System.out.println(Arrays.toString(a));//[1, 2, 3, 4, 5]
    }

}
