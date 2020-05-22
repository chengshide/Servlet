package com.imooc;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Animal obj1=new Animal();
		Animal obj2=new Dog();   //父类的引用是可以指向子类的对象
		Animal obj3=new Cat();
		obj1.eat();
		obj2.eat();
		obj3.eat();
		*/
		Dog dog=new Dog();
		Animal animal=dog;  //自动类型提升 向上类型转换
		Dog dog2=(Dog)animal;  //向下类型转换 强制类型转换
		if(animal instanceof Cat) {
			Cat cat=(Cat)animal;  //1.编译是Cat类型2.运行时Dog类型
		}else {
			System.out.println("无法进行类型转换");
		}

	}

}
