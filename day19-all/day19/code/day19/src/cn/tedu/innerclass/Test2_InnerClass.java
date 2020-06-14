package cn.tedu.innerclass;
//������������� �����ڲ���
public class Test2_InnerClass {
    public static void main(String[] args) {
        //new Inter()���൱�ڴ�����һ���ӿڵ�ʵ����Ķ���ֻ��������������ֻ��ִ��һ�����񣡣�
        new Inter(){//�����ڲ���
            @Override
            public void save() {
                System.out.println("save()...");
            }
            @Override
            public void get() {
                System.out.println("get()...");
            }
        }.save();//����ָ������

         Inter in = new Inter(){//�����ڲ���  ������������������֣��Ϳ���ִ�ж�������ˣ���
            @Override
            public void save() {
                System.out.println("save()...");
            }
            @Override
            public void get() {
                System.out.println("get()...");
            }
        };
        in.save();
        in.get();

        new Demo(){//���൱�ڴ����˳�����Ķ���
            @Override
            public void update() {
                System.out.println("update()...");
            }
        }.update();//����ָ������
    }
}
abstract class Demo{
   public abstract void update() ;
   public void show(){  System.out.println("show()..."); }
}
interface Inter{
    void save() ;
    void get() ;
}


