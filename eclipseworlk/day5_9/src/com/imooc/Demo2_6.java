package com.imooc;

public class Demo2_6 {
	private String name="imooc";
	int age=20;
	public class Inner{
		String name="��Ľ��";
		public void show() {
			System.out.println("�ⲿ���е�name��"+Demo2_6.this.name);
			System.out.println("�ڲ����е�name��"+name);
			System.out.println("β���е�age��"+age);
		}
	}

}
