package saolei;

import java.util.Random;



public class demo {
	public void initarr(gezi[][]bs) {
		for(int i=0;i<bs.length;i++) {
			for(int j=0;j<bs[i].length;j++) {
			bs[i][j]=new gezi();
		bs[i][j].setzhuantai(0);
		
		}
		}
		
	}

	public void initbomb(gezi[][]bs) {
		int index=0;
		while(index<10) {
			Random r=new Random();
			int i=r.nextInt(10);
			int j=r.nextInt(10);
			
			if(bs[i][j].getzhuangtai()==-1) {	
			
			}
			else { 
				
			bs[i][j].setzhuantai(-1);
			index++;
			}
			for(int e=0;e<bs.length;e++) {
				for(int f=0;f<bs[e].length;f++) {
					System.out.print(bs[e][f].getzhuangtai()+" ");
				}
				System.out.println();
			}
		}
	
		
	}
	public void initnumber(gezi[][]bs) {
		
		for(int i=0;i<bs.length;i++) {
			for(int j=0;j<bs[i].length;j++) {
				if(bs[i][j].getzhuangtai()==-1) {
					
				}
				else {
					for(int d=i-1;d<i+2;d++) {
						for(int e=j-1;e<j+2;e++) {
							if(d<10 && d>=0 && e<10 && e>=0) {
								if(bs[d][e].getzhuangtai()==-1) {
								int a=bs[i][j].getzhuangtai();
								bs[i][j].setzhuantai( a+1);
								}
							}
						}
				}

				}
			}
		
		}
			
			
		
		}

	
	public static void main(String[] args) {
		gezi[][]bs=new gezi[10][10];
		demo d=new demo();
		d.initarr(bs);
		d.initbomb(bs);
		d.initnumber(bs);
		for(int i=0;i<bs.length;i++) {
			for(int j=0;j<bs[i].length;j++) {
				System.out.print(bs[i][j].getzhuangtai()+" ");
			}
			System.out.println();
		}
	}
	}

