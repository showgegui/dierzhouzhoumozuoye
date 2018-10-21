package disiti;

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

	void eat() {
		System.out.println("老虎吃");
	}
	String getstate(int time) {
		String state=null;
		if(time>=0&&time<=24) {
			if(time>8&&time<12) {
				state="吃鹿";
			}
			else if(time>12&&time<15) {
				state="吃羊";
			}
			else {
				state="不吃";
			}
			
		}
		return state;
		}
	}

