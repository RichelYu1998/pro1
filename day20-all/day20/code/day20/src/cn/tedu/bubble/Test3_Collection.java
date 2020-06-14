package cn.tedu.bubble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//这个类用来测试 集合工具类 Collections
public class Test3_Collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //1、没用工具类前，需要一个个往里添加元素
//        list.add(1);
//        list.add(2);
//        list.add(3);
        //2、用了工具类，一次性向，指定集合中添加多个元素
        Collections.addAll(list,1,2,3,4,5);
        System.out.println(list);//[1, 2, 3, 4, 5]

        System.out.println( Collections.max(list)  );//获取指定集合中的最大值
        System.out.println( Collections.min(list)  );//获取指定集合中的最小值

        Collections.reverse(list);//把指定集合中的元素 反转
        Collections.sort(list);//给指定集合排序，从小到大
        Collections.swap(list,2,4);//将指定集合中的指定下标元素进行交换

        System.out.println(list);//[1, 2, 5, 4, 3]

    }
}
