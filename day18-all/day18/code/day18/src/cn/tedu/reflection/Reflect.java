package cn.tedu.reflection;
public class Reflect {
    //���췽��
    public Reflect() {}
    public Reflect(String name) {
        this.name = name;
    }
    public Reflect(int age) {
        this.age = age;
    }
    public Reflect(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //��Ա����
   public String name ;
   private int age ;
    //get()/set()
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //��ͨ
    public void show(){
        System.out.println("show()...");
    }
    private void show2(String a,int b){
        System.out.println("show2()..."+a+b);
    }
    //toString
    @Override
    public String toString() {
        return "Reflect{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
