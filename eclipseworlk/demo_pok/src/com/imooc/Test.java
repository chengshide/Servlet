package com.imooc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static List<Poker> pList;

	public static void main(String[] args) {
		Scanner inpot=new Scanner(System.in);
		Player player1;
		Player player2;
		pList=new ArrayList<Poker>();
		do {
			try {
				System.out.println("�������һλ��ҵ�����ID");
				int pId1=inpot.nextInt();
				System.out.println("�������һλ��ҵ��ǳ�");
				String pName1=inpot.next();
				player1=new Player(pId1,pName1);
				break;
			}catch (Exception e) {
				System.out.println("����������ID����");
				continue;
			}
		}while(true);
		do {
			try {
				System.out.println("������ڶ�λ��ҵ�����ID");
				int pId2=inpot.nextInt();
				System.out.println("������ڶ�λ��ҵ��ǳ�");
				String pName2=inpot.next();
				player2=new Player(pId2,pName2);
				break;
			}catch (Exception e) {
				System.out.println("����������ID����");
				continue;
			}
		}while(true);
		System.out.println("--------------��ʼϴ��---------------");
		Poker pok=new Poker();
		Poker pok1=new Poker();
		Poker pok2=new Poker();
		Poker pok3=new Poker();
		Poker pok4=new Poker();
		pok.stePok();
		System.out.println("--------------ϴ�ƽ���---------------");
		System.out.println("�����A����");
		pok1=pok1.rSetPok();
		player1.playerPoke.add(pok1);
		pList.add(pok1);
		System.out.println("�����B����");
//		do {
//			pok2=pok2.rSetPok();
//		}while(chong(pok2));
		pok2=pok2.rSetPok();
		player2.playerPoke.add(pok2);
		pList.add(pok2);
		System.out.println("�����A����");
//		do {
//			pok3=pok3.rSetPok();
//		}while(chong(pok3));
		pok3=pok3.rSetPok();
		player1.playerPoke.add(pok3);
		pList.add(pok3);
		System.out.println("�����B����");
//		do {
//			pok4=pok4.rSetPok();
//		}while(chong(pok4));
		pok4=pok4.rSetPok();
		player2.playerPoke.add(pok4);
		pList.add(pok4);
		int mun1=pok.comparePoker(player1.playerPoke.get(0), player1.playerPoke.get(1));
		int mun2=pok.comparePoker(player2.playerPoke.get(0), player2.playerPoke.get(1));
		int mun=0;
		if(mun1==1) {
			switch(mun2) {
			case 1:
				mun=pok.comparePoker(player1.playerPoke.get(0), player2.playerPoke.get(0));
				break;
			case 2:
				mun=pok.comparePoker(player1.playerPoke.get(0), player2.playerPoke.get(1));
				break;
			}
		}else if(mun1==2) {
			switch(mun2) {
			case 1:
				mun=pok.comparePoker(player1.playerPoke.get(1), player2.playerPoke.get(0));
				break;
			case 2:
				mun=pok.comparePoker(player1.playerPoke.get(1), player2.playerPoke.get(1));
				break;
			}
		}
		System.out.println("���"+player1.getName()+"�����ǣ�"+player1.playerPoke.get(0)+"��"+player1.playerPoke.get(1));
		System.out.println("���"+player2.getName()+"�����ǣ�"+player2.playerPoke.get(0)+"��"+player2.playerPoke.get(1));
		if(mun==1) {
			System.out.println("���"+player1.getName()+"Ӯ��");
		}else
			System.out.println("���"+player2.getName()+"Ӯ��");
	}
	public static boolean chong(Poker p) {
		int n=pList.indexOf(p);
		if(n<0)
		return true;
		else
			return false;
	}

}
