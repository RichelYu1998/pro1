package cn.tedu.api;
//这个类用来测试  Object的使用
//总结：
//1、在打印对象的时候，默认打印的就是地址值(原因是自动调用Object里的toString()..)。但是如果想打印属性值，就需要重写toString()...
//2、如果要比较两个对象间的地址值，就可以使用默认的Object提供的方式。但是，如果想要比较对象间的属性值，就需要重写equals()
public class Test1_Object {
	public static void main(String[] args) {
		// 创建对象测试
		Student s = new Student("皮皮霞", 20);
		// 2、需求：想查看对象的属性值，但是不想一个一个去get()
		// System.out.println( s.getName() + s.getAge() );
		// 底层默认调用了Object的toString()，默认打印了对象的地址值cn.tedu.api.Student@15db9742
		// 怎么做，才能 不看地址值 而 看属性值？--重写父类原有的toString()
		System.out.println(s);// Student [name=皮皮霞, age=20]

		System.out.println(s.hashCode());// 3、用来返回对象的哈希码值--相当于对象在内存中的编号，每个对象编号都不一样。

		Class clazz = s.getClass();// 4、返回该对象的Class类型
		System.out.println(clazz);// class cn.tedu.api.Student

		Student s2 = new Student("皮皮霞", 20);
		// 5、equals()：比较两个对象是否相等，默认使用Object提供的==比较
		System.out.println(s.equals(s2));
		// == 比较基本类型时，直接比值本身。 比较引用类型时，比较的是地址值。
		System.out.println(2 == 2);// true

		// 6、需求：别再比较两个对象的地址值了！！需要去比较两个对象间的属性值
		// 如果两个对象的每个属性值都完全一样，就让equals()认为两个对象是相同的，返回true
	}
}
// 创建Student类
// class Student extends Object{//1、每个类都继承了Object
class Student {
	// 构造方法
	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;

	// get() set() 右键-source-
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
	// 2、想要打印属性值而不是默认的地址值，需要重写Object的toString()
	// 右键-source-toString()...-ok
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	// 3、目前equals比较的是两个对象间的地址值！我想要比较对象间的属性值！！
	/*
	@Override
	public boolean equals(Object obj) {
		//把参数转成Student类型，是为了同一类型作比较
		Student param = (Student) obj ;
		//开始比较，拿着两个对象的属性比较
		if( this.name == param.name &&  this.age==param.age ) {
			return  true;//当两个对象的属性值完全相同时，就是同一个对象！！
		}
		return false;
	}*/
	//右键-source--hashCode() and equals()... ok
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
