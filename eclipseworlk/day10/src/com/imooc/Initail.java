package com.imooc;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Animal obj1=new Animal();
		Animal obj2=new Dog();   //����������ǿ���ָ������Ķ���
		Animal obj3=new Cat();
		obj1.eat();
		obj2.eat();
		obj3.eat();
		*/
		Dog dog=new Dog();
		Animal animal=dog;  //�Զ��������� ��������ת��
		Dog dog2=(Dog)animal;  //��������ת�� ǿ������ת��
		if(animal instanceof Cat) {
			Cat cat=(Cat)animal;  //1.������Cat����2.����ʱDog����
		}else {
			System.out.println("�޷���������ת��");
		}

	}

}
