package diyiti;

public class animal {
	private char name;
	private int age;
	private char type;
	private char sex;
	
//	定义内部属性
	public void setname(char name) {
		this.name=name;
		System.out.println(name);
	}
	public char getname() {
		return name;
	}
	public void setage(int age) {
		this.age=age;
		System.out.println(age);
	}
	public int getage() {
		return age;
	}
	public void settype(char type) {
		this.type=type;
		System.out.println(type);
	}
	public char gettype() {
		return type;
	}
	public void setsex(char sex) {
		this.sex=sex;
		System.out.println(sex);
	}
	public char getsex() {
		return sex;
	}

	


}
