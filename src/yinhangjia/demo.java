package yinhangjia;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char user;
		String password = null;
		int yue;
		char[]a=new char[10];
		for(int i=0;a[i]<10;i++) {
			System.out.println("请输入账户");
			System.out.println("输入x结束");
			a[i]=new java.util.Scanner(System.in).next().charAt(0);
			System.out.println("请输入密码");
			password=sc.nextLine();
			System.out.println("账户信息");
			yue=sc.nextInt();
			if(a[i]=='x') {
				break;
			}
			}
		System.out.println("1.登入");
		System.out.println("2.取款");
		System.out.println("3.存款");
		System.out.println("4.查询");
		System.out.println("5.注册");
		System.out.println("6.退出");
		int d;
		char c;
		d=sc.nextInt();
		int z;
		z=sc.nextInt();
		if(d==1&&z==7) {
			System.out.println("请输入用户名");
			c=new java.util.Scanner(System.in).next().charAt(0);
			System.out.println("请输入密码");
			String mima;
			mima=sc.nextLine();
			for(int i=0;i<a.length;i++) {
				if(c==a[i]&& mima.equals(password)) {
					System.out.println("成功登入");
					break;
				}
				else {
					System.out.println("账户名有错误");
				}
			}
		}
		if(d==1&&z==2) {
			int j=sc.nextInt();
			for(int i=0;i<a.length;i++) {
			if(j>yue && c==a[i]) {
				System.out.println("取钱多少");
				yue=j;
			}
			else {
				System.out.println("余额不足");
			}
		if(d==3) {
			System.out.println("请输入你要存的钱");
			for(int k=0;k<a.length;k++) {
				
			}
				
			}
		}
				
		}

		}
		
	

		
	
		
	}

