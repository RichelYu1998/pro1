package cn.tedu.reflection;
//�ṩһЩ�����Դ
public class Student extends Object{
    //�Ҽ� - generate - constructor- ok(����Ļ�������ctrlѡ��)
    public Student() { }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String name = "������";
    public int age = 20 ;
    public void show(){
        System.out.println("show()...");
    }
    public void add(int a){
        System.out.println("add()..."+a);
    }
    //�Ҽ� - generate - toString - ok
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
