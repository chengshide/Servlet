package com.imooc;

public class Dog extends Animal {
	public int age=20;
	public void eat() {
		System.out.println("年龄："+age+"狗是可以吃东西的");
	}
	public Dog() {
		System.out.println("Dog类执行了");
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
