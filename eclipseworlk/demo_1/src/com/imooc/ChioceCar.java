package com.imooc;

public class ChioceCar {
	public static double sumP=0; 
	public static int sum1=0; 
	public static int sum2=0; 
	public String name;
	public String chiocec(int a) {
		Truck cat1=new Truck();
		cat1.setName("�ɻ���");
		cat1.setPrice(400);
		cat1.setA(4);
		Truck cat2=new Truck();
		cat2.setName("��ά��");
		cat2.setPrice(1000);
		cat2.setA(20);
		PassCar car3=new PassCar();
		car3.setName("�µ�A4");
		car3.setPrice(500);
		car3.setA(4);
		PassCar car4=new PassCar();
		car4.setName("���Դ�6");
		car4.setPrice(400);
		car4.setA(4);
		PassCar car5=new PassCar();
		car5.setName("����");
		car5.setPrice(800);
		car5.setA(20);
		Prckup car6=new Prckup();
		car6.setA(4);
		car6.setB(2);
		car6.setName("Ƥ��ѩ6");
		car6.setPrice(450);
		switch(a) {
		case 1:
			sum1+=4;
			sumP+=400;
			name="�ɻ���";
			break;
		case 2:
			sum1+=20;
			sumP+=1000;
			name="��ά��";
			break;
		case 3:
			sum2+=4;
			sumP+=500;
			name="�µ�A4";
			break;
		case 4:
			sum2+=4;
			sumP+=400;
			name="���Դ�6";
			break;
		case 5:
			sum2+=20;
			sumP+=800;
			name="����";
			break;
		case 6:
			sum1+=2;
			sum2+=4;
			sumP=450;
			name="Ƥ��ѩ6";
			break;
		}
		return name;
	}

}
