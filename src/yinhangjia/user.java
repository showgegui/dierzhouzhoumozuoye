package yinhangjia;

public class user {
	private char name;
	private String passwords;
	private String zhanghu;
	public void bank() {
		System.out.println("用户是"+name);
	}
	public void setname(char a) {
		name=a;
	}
	public char getname() {
		return name;
	}
	public void setpasswords(String b) {
		passwords=b;
	}
	public String getpasswords() {
		return passwords;
	}
	public void setzhanghu(String c) {
		zhanghu=c;
	}
	public String getzhanghu() {
		return zhanghu;
	}
	
	
	

}
