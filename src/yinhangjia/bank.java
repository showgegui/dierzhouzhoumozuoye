package yinhangjia;

public class bank {
	private String kehu;
	private int[]f;
	public void userkehu(user d) {
		System.out.println("kehu");
		d.bank();
	}
	public void setkehu(String n) {
		kehu=n;
	}
	public String getkehu() {
		return kehu;
	}
	public void setf(int[] d ) {
		f=d;
	}
	public int[] getf() {
		return f;
	}
	

}
