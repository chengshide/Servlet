package com.imooc;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone tel1=new CellPhone();
		tel1.call();
		tel1.message();
		Telphone tel2=new SmatrPhone();
		tel2.call();
		tel2.message();
		
		IPlayGame ip1=new SmatrPhone();
		ip1.platGame();
		IPlayGame ip2=new Psp();
		ip2.platGame();
		
		IPlayGame ip3=new IPlayGame() {

			@Override
			public void platGame() {
				// TODO Auto-generated method stub
				System.out.println("ʹ�������ڲ���ķ�ʽʵ�ֽӿ�");
				
			}
			
		};
		ip3.platGame();
		
		new IPlayGame() {

			@Override
			public void platGame() {
				// TODO Auto-generated method stub
				System.out.println("ʹ�������ڲ���ķ�ʽʵ�ֽӿ�2");
				
			}
			
		}.platGame();

	}

}
