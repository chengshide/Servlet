package com.imooc.test;

public class TryCatchTest {

	public static void main(String[] args) {
		TryCatchTest tct=new TryCatchTest();
//		int result=tct.test();
//		System.out.println("test()������ִ����ϣ�����ֵΪ��"+result);
//		int result2=tct.test2();
//		System.out.println("test2���");
		int result=tct.test3();

	}
	/**
	 * divider(����)
	 * result(���)
	 * ÿ��ѭ����divider��һ��result=result+100/divider
	 * ����������쳣����ӡ������׳��쳣�ˣ�������������-1
	 * ���򣺷���result
	 * @return
	 */
	public int test() {
		int divider=10;
		int result=100;
		try {
			while(divider>-1) {
				divider--;
				result=result+100/divider;
			}
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣��");
			return -1;
		}
	}
	
	
	public int test2() {
		int divider=10;
		int result=100;
		try {
			while(divider>-1) {
				divider--;
				result=result+100/divider;
			}
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣��");
			return 999;
		}finally{
			System.out.println("����finally");
			System.out.println("����result���ҵ�ֵ�ǣ�"+result);
		}
	}
	public int test3() {
		int divider=10;
		int result=100;
		try {
			while(divider>-1) {
				divider--;
				result=result+100/divider;
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣��");
		}finally{
			System.out.println("����finally");
			System.out.println("����result���ҵ�ֵ�ǣ�"+result);
		}
		System.out.println("test3���");
		return 1111;
	}

}
