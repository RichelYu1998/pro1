package cn.tedu.bubble;

//������������� Lambda���ʽ���Ż��������ڲ���ı�д
//���
//Lambda ���ʽ��lambda expression����һ������������Lambda���ʽ������ѧ�еĦ����������ֱ�Ӷ�Ӧ�����е�lambda����lambda abstraction������һ��������������û�к������ĺ�����
//�﷨��(�����б�) -> {��������}
public class Test6_Lambda {
    public static void main(String[] args) {
        //2��������������  +  �����ڲ��࣬ʹ�ýӿڵĹ���
        Demo d = new Demo(){
            @Override
            public void save() {
                System.out.println("save()...");
            }
        } ;
        d.save();
        //3��Lambda���ʽ�Ż������ڲ���
//      Demo d2 = (�����б�) -> { ������  } ;
        Demo d2 = () -> {  System.out.println("save()...lambda");  } ;//3.1��Lambda���ʽû����
        d2.save();

        Demo2 demo2 = (int x,int y) -> {  System.out.println(x+y); } ;//4��Lambda���ʽ�в���
        demo2.add(1,2);//4.1����ʵ��1 �� 2 ���ݸ����β� x �� y ������ӡ��͵Ľ��

        Demo3 demo3 = (int m,int n)->  { return m+n ;  } ; //5��Lambda���ʽ�в��� �з���ֵ��ͨ��return��ֵ����
        System.out.println( demo3.add(5,10)  );//5.1����ʵ��5 �� 10 ���ݸ����β� m �� n ����ͣ������ؽ��
    }
}
interface Demo3{
    int add(int a,int b);
}
interface Demo2{
    void add(int a,int b) ;
}
//1��׼���ӿڣ�Lambda���ʽҪ��ӿ��У�ֻ����һ�����󷽷���
interface Demo{
    void save ();
}





