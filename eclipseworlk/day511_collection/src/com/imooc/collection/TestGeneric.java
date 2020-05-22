package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	/**
	 * 带有泛型——Course的list声明
	 */	
	public List<Course> coures;
	
	public TestGeneric() {
		this.coures=new ArrayList<Course>();
	}
	
	/**
	 * 测试添加
	 * @param args
	 */
	public void testAdd() {
		Course cr1=new Course("1","大学语文");
		coures.add(cr1);
		Course cr2=new Course("2","java基础");
		coures.add(cr2);
	}
	
	/**
	 * 测试循环遍历
	 * @param args
	 */
	public void testForEach() {
		for(Course cr:coures) {
			System.out.println(cr.id+":"+cr.name);
		}
	}
	
	/**
	 * 泛型集合可以添加泛型子类型的对象实例
	 * @param args
	 */
	public void testChild() {
		ChildCourse ccr=new ChildCourse();
		ccr.id="3";
		ccr.name="我是子类型的课程对象实例";
		coures.add(ccr);
	}
	
	/**
	 * 泛型不能使用基本类型
	 * @param args
	 */
	public void testBasicType() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		System.out.println("基本类型必须使用包装类作为泛型"+list.get(0));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric tg=new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
		tg.testBasicType();
	}

}
