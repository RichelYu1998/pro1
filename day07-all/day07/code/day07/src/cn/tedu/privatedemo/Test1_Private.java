package cn.tedu.privatedemo;
//�������������  ��װ
//�Զ�����set() get()   ��  �Ҽ� - source - setters  and getters - select all - ok
public class Test1_Private {
	public static void main(String[] args) {
		//2�������������
//		new Student().coding() ; //��������ȱ�㣺ʹ��ʱ�������ִֻ��һ�������ŵ㣺��ʡ�ڴ�
		Student s = new Student() ;
//		s.coding();  // 3.1����Ϊcoding()����װ�ˣ������Լ����У�������ﶼ�����á�
		s.game();
		
//		s.name = "jack";//5.1 ����ֵʧ�ܣ���Ϊname��private��
//		System.out.println(s.name);//5.1 ��ȡֵʧ�ܣ���Ϊname��private��
		//7�����ù�����setName()����ֵ
		s.setName("jack");
		//8.1�����ù�����getName()��ȡֵ
		String name = s.getName() ; 
		System.out.println(name);
//		System.out.println(s.age);
//		System.out.println(s.score);
		s.setAge(20);
		s.setScore(99.9);
		System.out.println(  s.getAge() );
		System.out.println(  s.getScore() );
		
	}
}
//����ѧ����
class Student{
	//TODO ��װ��������  +  �ṩset/get  +  ������
	private String subject ; 
	private String addr ; 
	private int tall ;
	//�Ҽ� - source - setters  and getters - select all - ok
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getTall() {
		return tall;
	}
	public void setTall(int tall) {
		this.tall = tall;
	}
	
	//5��ʹ��private���γ�Ա��������Ȼ������߰�ȫ�ԡ����ǣ���绹��ģ������ȡ��ô�죿
	private String name ;
	
	//6�������������˽�еĳ�Ա�����������ʹ�����ȫ�ַ��ʵ�
	//7��1�������Է��ʹ�����setXxx() ����ֵ��
	public void setName(String n) {
		name = n ;//��name��������ֵ
	}
	//8�����Է��ʹ�����getXxx()��ȡֵ��
	public String getName(){
		return name  ; //��name���Ե�ֵ���ظ�������λ��
	}
	//��װ��������  +  �ṩset/get  +  ������
	private int age ;
	private double score ; 
	//set()��������ֵ  
	public void setAge(int a) {
		age = a ;
	}
	public void setScore(double d) {
		score = d  ;
	}
	//get()������ȡֵ
	public int getAge(){
		return age ; 
	}
	public double getScore(){
		return score ;
	}
	
	//3��ͨ��private�ؼ���ʵ�ַ�װ����ֻ���ڱ�����ʹ�á��������ʹ�÷�װ����Դ��ֻ���ṩ��ӵķ��ʷ���
	private void coding() {
		System.out.println("coding...");
	}
	public void game() {
		coding() ;//4����ӷ���private��Դ
		System.out.println("game...");
	}
	
}

