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
		throw new DrunkException("喝酒别开车！");
		
	}
	public void test2() {
		try {
			test1();
		} catch (DrunkException e) {
			// TODO Auto-generated catch block
			RuntimeException newExc=new RuntimeException("司机一滴酒，亲人两行泪");
			newExc.initCause(e);
			throw newExc;
		}
	}

}
