package cn.tedu.collection;
import java.util.HashSet;

//这个类用来测试  利用set集合去重
//总结：
//1、set集合常用于去重
//2、如果想利用set集合给自定义对象去重。需要同时提供重写的hashCode()  和  equals()  ！！！
//3、重写hashCode()：是为了让底层运算哈希值时，可以根据对象的属性值运算。
		//如果两个对象的属性值一样，即将得到相同的hash值
//4、重写equals()：是为了让底层在判断两个对象是否相等时，可以根据对象间的属性值判断。
		//如果两个对象的属性值一样，就认为是相等的，让equals()返回true
public class Test5_HashSet2 {
	public static void main(String[] args) {
		//1、创建HashSet对象
		HashSet<Student> set = new HashSet<>();
		Student s1 = new Student("jack",18);
		Student s2 = new Student("rose",20);
		Student s3 = new Student("tony",30);
		//2、加入set中
		set.add(s1);
		set.add(s2);
		set.add(s3);
		//3、set集合不是可以去重吗？-- 能不能把自定义的对象去重呢？-- 暂时没去重！！
		Student s4 = new Student("jack",18);
		//4、怀疑add()在添加自定义的对象时，没有根据属性去重！！
//if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
		//5、为了使两个对象间的hash值一致，我们需要把只要new一次就计算一个hash值这种默认实现方式改掉。
		//这时，需要重写hashCode()让此方法运算出来的hash值可以根据对象的属性值运算。
		set.add(s4);
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(set);
	}
}
//创建Student类
class Student{
	public Student() {}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	private String name ;
	private int age;
	
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	//右键-source-generator equals() and hashCode()-ok
	
	//5、为了使两个对象间的hash值一致，我们需要把只要new一次就计算一个hash值这种默认实现方式改掉。
	//这时，需要重写hashCode()让此方法，运算出来的hash值可以根据对象的属性值运算。
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	//6、为了让两个对象间，比较属性值，需要提供重写的equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
