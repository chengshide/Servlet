package com.imooc;

public class Fangneibu {
	private String name="爱慕课";
	public void show() {
		class MInner{
			int score=83;
			public int getScore() {
				return score+10;
			}
		}
		MInner a=new MInner();
		int newScore=a.getScore();
		System.out.println("姓名："+name+"\n加分后的成绩："+newScore);
	}

}
