package dadishu;

import java.util.Random;



public class demo {
	public void initarr(dishu[][]bs) {
		for(int i=0;i<bs.length;i++) {
			for(int j=0;j<bs[i].length;j++) {
			bs[i][j]=new dishu();
		bs[i][j].setc('H');
		}
			
		
		}
		
	}
	public void initbomb(dishu[][]bs) {
		int index=0;
		while(index<16) {
			Random r=new Random();
			int i=r.nextInt(4);
			int j=r.nextInt(4);
	
			if(bs[i][j].getc()=='M') {	
			
			}
			else { 
				
			bs[i][j].setc('M');
		
			index++;
			
			}
			for(int e=0;e<bs.length;e++) {
				for(int f=0;f<bs[e].length;f++) {
					System.out.print(bs[e][f].getc()+" ");
				}
				System.out.println();
			}
		}
	
		
	}
	public static void main(String[] args) {
		dishu[][]bs=new dishu[4][4];
		demo d=new demo();
		d.initarr(bs);
		d.initbomb(bs);
		
		for(int i=0;i<bs.length;i++) {
			for(int j=0;j<bs[i].length;j++) {
				System.out.print(bs[i][j].getc()+" ");
			}
			System.out.println();
		}
	}

}



