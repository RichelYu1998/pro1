package cn.tedu.bubble;

import java.util.Arrays;

//�������������ð����������Ԫ�رȽ�  +  ����λ��
public class Test1_Bubble {
    public static void main(String[] args) {
        //1��������������
        int[] a = {18, 9, 30, 26, 1};
        //2����ʼ�Ƚϣ���С����
        //��ѭ������������  -1 ����Ϊ5������ֻ��Ҫ�Ƚ�4�֡�i= 0 1 2 3
        for (int i = 0; i < a.length - 1; i++) {
            //��ѭ�������ڱȽ� + ����λ��
//for (int j = 0; j < a.length - 1; j++) {
// ����Ч�ʵͣ����ܰ�ÿ�ֶ��̶��Ƚ�4�Ρ�Ӧ��ÿ�ֶ����ٱȽϴ�����-0  -1 -2 -3
// �Ż���-i����Ϊ����һ�֣�Ҫ��4�Ρ��ڶ��֣�Ҫ��3�Ρ������֣�Ҫ��2�Ρ������֣�Ҫ��1��
            for (int j = 0; j < a.length - 1 - i ; j++) {
                if (a[j] > a[j + 1]) {//�����±�j��Ӧ��Ԫ�� ��  �±� j+1��Ӧ��Ԫ��  ȥ��
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }
}



