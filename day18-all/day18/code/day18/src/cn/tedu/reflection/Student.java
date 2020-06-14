package cn.tedu.reflection;
//提供一些类的资源
public class Student extends Object{
    //右键 - generate - constructor- ok(多个的话，按着ctrl选中)
    public Student() { }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String name = "彭于晏";
    public int age = 20 ;
    public void show(){
        System.out.println("show()...");
    }
    public void add(int a){
        System.out.println("add()..."+a);
    }
    //右键 - generate - toString - ok
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
