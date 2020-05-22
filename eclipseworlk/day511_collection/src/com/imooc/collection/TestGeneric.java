package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	/**
	 * ���з��͡���Course��list����
	 */	
	public List<Course> coures;
	
	public TestGeneric() {
		this.coures=new ArrayList<Course>();
	}
	
	/**
	 * �������
	 * @param args
	 */
	public void testAdd() {
		Course cr1=new Course("1","��ѧ����");
		coures.add(cr1);
		Course cr2=new Course("2","java����");
		coures.add(cr2);
	}
	
	/**
	 * ����ѭ������
	 * @param args
	 */
	public void testForEach() {
		for(Course cr:coures) {
			System.out.println(cr.id+":"+cr.name);
		}
	}
	
	/**
	 * ���ͼ��Ͽ�����ӷ��������͵Ķ���ʵ��
	 * @param args
	 */
	public void testChild() {
		ChildCourse ccr=new ChildCourse();
		ccr.id="3";
		ccr.name="���������͵Ŀγ̶���ʵ��";
		coures.add(ccr);
	}
	
	/**
	 * ���Ͳ���ʹ�û�������
	 * @param args
	 */
	public void testBasicType() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		System.out.println("�������ͱ���ʹ�ð�װ����Ϊ����"+list.get(0));
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
