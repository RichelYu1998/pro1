package cn.tedu.api;
//�������������  Object��ʹ��
//�ܽ᣺
//1���ڴ�ӡ�����ʱ��Ĭ�ϴ�ӡ�ľ��ǵ�ֵַ(ԭ�����Զ�����Object���toString()..)������������ӡ����ֵ������Ҫ��дtoString()...
//2�����Ҫ�Ƚ����������ĵ�ֵַ���Ϳ���ʹ��Ĭ�ϵ�Object�ṩ�ķ�ʽ�����ǣ������Ҫ�Ƚ϶���������ֵ������Ҫ��дequals()
public class Test1_Object {
	public static void main(String[] args) {
		// �����������
		Student s = new Student("ƤƤϼ", 20);
		// 2��������鿴���������ֵ�����ǲ���һ��һ��ȥget()
		// System.out.println( s.getName() + s.getAge() );
		// �ײ�Ĭ�ϵ�����Object��toString()��Ĭ�ϴ�ӡ�˶���ĵ�ֵַcn.tedu.api.Student@15db9742
		// ��ô�������� ������ֵַ �� ������ֵ��--��д����ԭ�е�toString()
		System.out.println(s);// Student [name=ƤƤϼ, age=20]

		System.out.println(s.hashCode());// 3���������ض���Ĺ�ϣ��ֵ--�൱�ڶ������ڴ��еı�ţ�ÿ�������Ŷ���һ����

		Class clazz = s.getClass();// 4�����ظö����Class����
		System.out.println(clazz);// class cn.tedu.api.Student

		Student s2 = new Student("ƤƤϼ", 20);
		// 5��equals()���Ƚ����������Ƿ���ȣ�Ĭ��ʹ��Object�ṩ��==�Ƚ�
		System.out.println(s.equals(s2));
		// == �Ƚϻ�������ʱ��ֱ�ӱ�ֵ���� �Ƚ���������ʱ���Ƚϵ��ǵ�ֵַ��
		System.out.println(2 == 2);// true

		// 6�����󣺱��ٱȽ���������ĵ�ֵַ�ˣ�����Ҫȥ�Ƚ���������������ֵ
		// ������������ÿ������ֵ����ȫһ��������equals()��Ϊ������������ͬ�ģ�����true
	}
}
// ����Student��
// class Student extends Object{//1��ÿ���඼�̳���Object
class Student {
	// ���췽��
	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;

	// get() set() �Ҽ�-source-
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
	// 2����Ҫ��ӡ����ֵ������Ĭ�ϵĵ�ֵַ����Ҫ��дObject��toString()
	// �Ҽ�-source-toString()...-ok
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	// 3��Ŀǰequals�Ƚϵ������������ĵ�ֵַ������Ҫ�Ƚ϶���������ֵ����
	/*
	@Override
	public boolean equals(Object obj) {
		//�Ѳ���ת��Student���ͣ���Ϊ��ͬһ�������Ƚ�
		Student param = (Student) obj ;
		//��ʼ�Ƚϣ�����������������ԱȽ�
		if( this.name == param.name &&  this.age==param.age ) {
			return  true;//���������������ֵ��ȫ��ͬʱ������ͬһ�����󣡣�
		}
		return false;
	}*/
	//�Ҽ�-source--hashCode() and equals()... ok
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
