package com.imooc.test;

public class ChainTest {

	public static void main(String[] args) {
		ChainTest ct=new ChainTest();
		try {
			ct.test2();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void test1() throws DrunkException{
		throw new DrunkException("�ȾƱ𿪳���");
		
	}
	public void test2() {
		try {
			test1();
		} catch (DrunkException e) {
			// TODO Auto-generated catch block
			RuntimeException newExc=new RuntimeException("˾��һ�ξƣ�����������");
			newExc.initCause(e);
			throw newExc;
		}
	}

}
