package com.imooc.test;

public class TryCatchTest {

	public static void main(String[] args) {
		TryCatchTest tct=new TryCatchTest();
//		int result=tct.test();
//		System.out.println("test()方法，执行完毕！返回值为："+result);
//		int result2=tct.test2();
//		System.out.println("test2完毕");
		int result=tct.test3();

	}
	/**
	 * divider(除数)
	 * result(结果)
	 * 每次循环，divider减一，result=result+100/divider
	 * 如果：捕获异常，打印输出“抛出异常了！！！”，返回-1
	 * 否则：返回result
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
			System.out.println("循环抛出异常了");
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
			System.out.println("循环抛出异常了");
			return 999;
		}finally{
			System.out.println("这是finally");
			System.out.println("我是result，我的值是："+result);
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
			System.out.println("循环抛出异常了");
		}finally{
			System.out.println("这是finally");
			System.out.println("我是result，我的值是："+result);
		}
		System.out.println("test3完毕");
		return 1111;
	}

}
