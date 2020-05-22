package com.imooc;

public class SOuter {
	private int a=99;
	static int b=1;
	public static class SInner{
		int b=2;
		public void test() {
			System.out.println("访问外部类的b:"+SOuter.b);
			System.out.println("访问内部类的b:"+b);
		}
	}

}
