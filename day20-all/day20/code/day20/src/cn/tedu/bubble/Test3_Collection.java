package cn.tedu.bubble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//������������� ���Ϲ����� Collections
public class Test3_Collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //1��û�ù�����ǰ����Ҫһ�����������Ԫ��
//        list.add(1);
//        list.add(2);
//        list.add(3);
        //2�����˹����࣬һ������ָ����������Ӷ��Ԫ��
        Collections.addAll(list,1,2,3,4,5);
        System.out.println(list);//[1, 2, 3, 4, 5]

        System.out.println( Collections.max(list)  );//��ȡָ�������е����ֵ
        System.out.println( Collections.min(list)  );//��ȡָ�������е���Сֵ

        Collections.reverse(list);//��ָ�������е�Ԫ�� ��ת
        Collections.sort(list);//��ָ���������򣬴�С����
        Collections.swap(list,2,4);//��ָ�������е�ָ���±�Ԫ�ؽ��н���

        System.out.println(list);//[1, 2, 5, 4, 3]

    }
}
