package com.imooc;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChioceCar ch=new ChioceCar();
		System.out.println("欢迎使用大大租车系统，请输入密码");
		Scanner input=new Scanner(System.in);
		String p=input.nextLine();
		if(p.equals("123456")) {
			System.out.println("是否需要租车：1是，0否");
			int aa=input.nextInt();
			if(aa==1) {
				System.out.println("目录表格：");
				System.out.println("序号  名称 单价 功能");
				System.out.println("1.  松花江  400元一天  载重4吨");
				System.out.println("2.  依维柯  1000元一天  载重20吨");
				System.out.println("3.  奥迪A4  500元一天  载客4人");
				System.out.println("4.  马自达6  400元一天  载客4人");
				System.out.println("5.  金龙  800元一天  载客20人");
				System.out.println("6.  皮卡雪6  450元一天 载客4 载重2吨");
				System.out.println("请输入您要选择的数量：");
				int a1=input.nextInt();
				String str[]=new String[a1];
				for(int i=1;i<=a1;i++) {
					System.out.println("请输入第"+i+"辆车的序号：");
					int a3=input.nextInt();
					str[i-1]=ch.chiocec(a3);
				}
				System.out.println("****您的账单为：");
				System.out.println("您选的车辆名字是：");
				for(int i=0;i<a1;i++) {
					System.out.print(str[i]+"      ");
				}
				System.out.println("您的总价格是："+ch.sumP+"元     总载客量是："+ch.sum2+"人      总载货量是："+ch.sum1+"吨");
			}else {
				System.out.println("再见，不送");
			}
		}else {
			System.out.println("密码错误");
		}

	}

}
