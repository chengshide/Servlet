package com.imooc;

public class Dog extends Animal {
	public int age=20;
	public void eat() {
		System.out.println("���䣺"+age+"���ǿ��ԳԶ�����");
	}
	public Dog() {
		System.out.println("Dog��ִ����");
	}
	public void method() {
		System.out.println(age);
		super.eat();
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}
	

}
