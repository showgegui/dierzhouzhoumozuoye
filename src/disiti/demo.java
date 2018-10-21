package disiti;

public class demo {
	public static void main(String[] args) {
		animal laoshu=new animal();
		tiger xiaohu=new tiger();
		xiaohu.setage(10);
		xiaohu.setname('A');
		xiaohu.setsex('公');
		xiaohu.settype('红');
		System.out.println();
		lu xiaolu=new lu();
		xiaolu.setage(3);
		xiaolu.setname('b');
		xiaolu.setsex('母');
		xiaolu.settype('白');
		System.out.println();
		yang yang=new yang();
		yang.setage(2);
		yang.setname('c');
		yang.setsex('公');
		yang.settype('黑');
		System.out.println();
		
		System.out.println("老虎十点现在吃什么");
		System.out.println(laoshu.getstate(10));
	}

}
