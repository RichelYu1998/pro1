package cn.tedu.innerclass;

//������������� �ڲ���
public class Test1_Inner {
    public static void main(String[] args) {
        //�����ڲ������ʹ���ڲ�����Դ
//        Outer.Inner oi = new Outer().new Inner() ;  //2����Ϊ�ڲ��౻Private���޷�ֱ��new
//        oi.showIn();
        //4������showOut()
        new Outer().showOut();
        //6��ʹ�þ�̬���ڲ���Inner2����Դ  --  ����ֱ��ͨ���ⲿ����.�ڲ���������λ�ڲ���
        Outer.Inner2 oi = new Outer.Inner2() ;
        oi.showIn2();
        //7�����ʾ�̬�ڲ�����  ��̬����
        Outer.Inner2.showIn2();
    }
}
class Outer{//�ⲿ��
    String name ;
    public void showOut(){
        //3����ӷ���showIn()
        new Inner().showIn();
        System.out.println("showOut()...");
    }
    //5���ڲ��౻static����
    static class Inner2{
        int count = 10 ;
       static public void showIn2(){
            System.out.println("showIn2()...");
        }
    }
    //1���ڳ�Աλ�õ��ڲ��࣬�г�Ա�ڲ��ࡣ���Ա�private���Σ�Ҳ���Ա�static����
    private class Inner{//�ڲ���
        int age ;
        public void showIn(){
            System.out.println("showIn()...");
        }
    }
}





