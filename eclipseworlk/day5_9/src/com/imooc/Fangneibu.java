package com.imooc;

public class Fangneibu {
	private String name="��Ľ��";
	public void show() {
		class MInner{
			int score=83;
			public int getScore() {
				return score+10;
			}
		}
		MInner a=new MInner();
		int newScore=a.getScore();
		System.out.println("������"+name+"\n�ӷֺ�ĳɼ���"+newScore);
	}

}
