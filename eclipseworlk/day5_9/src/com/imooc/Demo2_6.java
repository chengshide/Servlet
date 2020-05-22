package com.imooc;

public class Demo2_6 {
	private String name="imooc";
	int age=20;
	public class Inner{
		String name="爱慕课";
		public void show() {
			System.out.println("外部类中的name："+Demo2_6.this.name);
			System.out.println("内部类中的name："+name);
			System.out.println("尾部中的age："+age);
		}
	}

}
