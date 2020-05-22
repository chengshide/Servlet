package com.imooc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 通过Collections.sort()方法，对Integer泛型的List进行排序
 * 对String泛型的List进行排序
 * 对其他类型泛型的List进行排序，以Student为例
 * @author 幽静丶孤寂
 *
 */
public class CollectionsTest {

	/**
	 * 通过Collections.sort()方法，对Integer泛型的List进行排序
	 * 创建一个Integer泛型的List，插入十个100以内的不重复随机整数，
	 * 调用Collections.sort()方法对其进行排序
	 * @param args
	 */
	public void testSort1() {
		List<Integer> integerList=new ArrayList<Integer>();
		//插入十个100以内的不重复随机整数
		Random random=new Random();
		Integer k;
		for(int i=0;i<10;i++) {
			do {
				k=random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("成功添加整数："+k);
		}
		System.out.println("-----------排序前------------");
		for(Integer integer:integerList) {
			System.out.println("元素："+integer);
		}
		Collections.sort(integerList);
		System.out.println("-----------排序后------------");
		for(Integer integer:integerList) {
			System.out.println("元素："+integer);
		}
	}
	
	/**
	 * 对其他类型泛型的List进行排序，以Student为例
	 * @param args
	 */
	public void testSort3() {
		List<Student> studentList=new ArrayList<Student>();
		Random random=new Random();
		studentList.add(new Student(30+"","Angela"));
		studentList.add(new Student(103+"","Mike"));
		studentList.add(new Student(2+"","Lucy"));
		System.out.println("--------排序前------------");
		for (Student student : studentList) {
			System.out.println("学生"+student.id+":"+student.name);
		}
		Collections.sort(studentList);
		System.out.println("--------排序后------------");
		for (Student student : studentList) {
			System.out.println("学生"+student.id+":"+student.name);
		}
		System.out.println("----------按姓名排序后-------------");
		Collections.sort(studentList,new StudentComparator());
		for (Student student : studentList) {
			System.out.println("学生"+student.id+":"+student.name);
		}
	}
	
	public static void main(String[] args) {
		CollectionsTest ct=new CollectionsTest();
//		ct.testSort1();
		ct.testSort3();
	}

}
