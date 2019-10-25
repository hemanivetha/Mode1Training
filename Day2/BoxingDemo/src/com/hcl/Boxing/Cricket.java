package com.hcl.Boxing;

public class Cricket {

	static int score;
	public void incr(int x){
		score+=x;
	}
	
	public static void main(String[] args) {
		Cricket a=new Cricket();
		Cricket b=new Cricket();
		Cricket c=new Cricket();
		
		a.incr(67);
		b.incr(43);
		c.incr(7);
		System.out.println(Cricket.score);
	}
}
