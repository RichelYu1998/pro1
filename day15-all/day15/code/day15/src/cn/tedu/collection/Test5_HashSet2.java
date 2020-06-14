package cn.tedu.collection;
import java.util.HashSet;

//�������������  ����set����ȥ��
//�ܽ᣺
//1��set���ϳ�����ȥ��
//2�����������set���ϸ��Զ������ȥ�ء���Ҫͬʱ�ṩ��д��hashCode()  ��  equals()  ������
//3����дhashCode()����Ϊ���õײ������ϣֵʱ�����Ը��ݶ��������ֵ���㡣
		//����������������ֵһ���������õ���ͬ��hashֵ
//4����дequals()����Ϊ���õײ����ж����������Ƿ����ʱ�����Ը��ݶ���������ֵ�жϡ�
		//����������������ֵһ��������Ϊ����ȵģ���equals()����true
public class Test5_HashSet2 {
	public static void main(String[] args) {
		//1������HashSet����
		HashSet<Student> set = new HashSet<>();
		Student s1 = new Student("jack",18);
		Student s2 = new Student("rose",20);
		Student s3 = new Student("tony",30);
		//2������set��
		set.add(s1);
		set.add(s2);
		set.add(s3);
		//3��set���ϲ��ǿ���ȥ����-- �ܲ��ܰ��Զ���Ķ���ȥ���أ�-- ��ʱûȥ�أ���
		Student s4 = new Student("jack",18);
		//4������add()������Զ���Ķ���ʱ��û�и�������ȥ�أ���
//if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
		//5��Ϊ��ʹ����������hashֵһ�£�������Ҫ��ֻҪnewһ�ξͼ���һ��hashֵ����Ĭ��ʵ�ַ�ʽ�ĵ���
		//��ʱ����Ҫ��дhashCode()�ô˷������������hashֵ���Ը��ݶ��������ֵ���㡣
		set.add(s4);
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(set);
	}
}
//����Student��
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
	//�Ҽ�-source-generator equals() and hashCode()-ok
	
	//5��Ϊ��ʹ����������hashֵһ�£�������Ҫ��ֻҪnewһ�ξͼ���һ��hashֵ����Ĭ��ʵ�ַ�ʽ�ĵ���
	//��ʱ����Ҫ��дhashCode()�ô˷��������������hashֵ���Ը��ݶ��������ֵ���㡣
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	//6��Ϊ������������䣬�Ƚ�����ֵ����Ҫ�ṩ��д��equals()
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
