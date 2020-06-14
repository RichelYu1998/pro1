package cn.tedu.bubble;

import java.util.Arrays;

//这个类用来测试冒泡排序：相邻元素比较  +  交换位置
public class Test1_Bubble {
    public static void main(String[] args) {
        //1、定义无序数组
        int[] a = {18, 9, 30, 26, 1};
        //2、开始比较：从小到大
        //外循环控制轮数，  -1 是因为5个数，只需要比较4轮。i= 0 1 2 3
        for (int i = 0; i < a.length - 1; i++) {
            //内循环：相邻比较 + 交换位置
//for (int j = 0; j < a.length - 1; j++) {
// 这样效率低，不能把每轮都固定比较4次。应该每轮都减少比较次数。-0  -1 -2 -3
// 优化：-i是因为，第一轮，要比4次。第二轮，要比3次。第三轮，要比2次。第四轮，要比1次
            for (int j = 0; j < a.length - 1 - i ; j++) {
                if (a[j] > a[j + 1]) {//拿着下标j对应的元素 和  下标 j+1对应的元素  去比
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }
}



