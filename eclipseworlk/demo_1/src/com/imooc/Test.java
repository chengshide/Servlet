package com.imooc;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChioceCar ch=new ChioceCar();
		System.out.println("��ӭʹ�ô���⳵ϵͳ������������");
		Scanner input=new Scanner(System.in);
		String p=input.nextLine();
		if(p.equals("123456")) {
			System.out.println("�Ƿ���Ҫ�⳵��1�ǣ�0��");
			int aa=input.nextInt();
			if(aa==1) {
				System.out.println("Ŀ¼���");
				System.out.println("���  ���� ���� ����");
				System.out.println("1.  �ɻ���  400Ԫһ��  ����4��");
				System.out.println("2.  ��ά��  1000Ԫһ��  ����20��");
				System.out.println("3.  �µ�A4  500Ԫһ��  �ؿ�4��");
				System.out.println("4.  ���Դ�6  400Ԫһ��  �ؿ�4��");
				System.out.println("5.  ����  800Ԫһ��  �ؿ�20��");
				System.out.println("6.  Ƥ��ѩ6  450Ԫһ�� �ؿ�4 ����2��");
				System.out.println("��������Ҫѡ���������");
				int a1=input.nextInt();
				String str[]=new String[a1];
				for(int i=1;i<=a1;i++) {
					System.out.println("�������"+i+"��������ţ�");
					int a3=input.nextInt();
					str[i-1]=ch.chiocec(a3);
				}
				System.out.println("****�����˵�Ϊ��");
				System.out.println("��ѡ�ĳ��������ǣ�");
				for(int i=0;i<a1;i++) {
					System.out.print(str[i]+"      ");
				}
				System.out.println("�����ܼ۸��ǣ�"+ch.sumP+"Ԫ     ���ؿ����ǣ�"+ch.sum2+"��      ���ػ����ǣ�"+ch.sum1+"��");
			}else {
				System.out.println("�ټ�������");
			}
		}else {
			System.out.println("�������");
		}

	}

}
