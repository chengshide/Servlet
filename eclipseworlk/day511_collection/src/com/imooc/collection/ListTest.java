package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * 备选课程类
 * @author 幽静丶孤寂
 *
 */
public class ListTest {
	/**
	 * 用于存放备选课程的List
	 */
	public List coursesToSelect;
	public ListTest() {
		this.coursesToSelect=new ArrayList();
	}
	/**
	 * 用于往coursesToSelect中添加备选课程
	 */
	public void testAdd(){
		Course cr1=new Course("1","数据结构");
		coursesToSelect.add(cr1);
		Course temp=(Course)coursesToSelect.get(0);
		System.out.println("添加了课程："+temp.id+":"+temp.name);
		Course cr2=new Course("2","C语言");
		coursesToSelect.add(0,cr2);
		Course temp2=(Course)coursesToSelect.get(0);
		System.out.println("添加了课程："+temp2.id+":"+temp2.name);
		coursesToSelect.add(cr1);
		Course temp0=(Course)coursesToSelect.get(2);
		System.out.println("添加了课程："+temp0.id+":"+temp0.name);
		
		Course[] course = {new Course("3","离散数学"),new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3=(Course) coursesToSelect.get(3);
		Course temp4=(Course) coursesToSelect.get(4);
		System.out.println("添加了两门课程："+temp3.id+":"+temp3.name
				+temp4.id+":"+temp4.name);
		Course[] course2 = {new Course("5","高等数学"),new Course("6","大学英语")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5=(Course) coursesToSelect.get(2);
		Course temp6=(Course) coursesToSelect.get(3);
		System.out.println("添加了两门课程："+temp5.id+":"+temp5.name
				+temp6.id+":"+temp6.name);
		
	}
	
	/**
	 * 取得List中的元素的方法
	 * @param args
	 */
	public void testGet() {
		int size=coursesToSelect.size();
		System.out.println("有如下课程待选：");
		for(int i=0;i<size;i++) {
			Course cr=(Course) coursesToSelect.get(i);
			System.out.println("课程："+cr.id +":"+cr.name);
		}
	}
	
	/**
	 * 通过迭代器来遍历List
	 * @param args
	 */
	public void testIterator() {
		//通过集合的iterator方法，取得迭代器的实例
		Iterator it=coursesToSelect.iterator();
		System.out.println("有如下课程待选(通过迭代器返回)：");
		while(it.hasNext()) {
			Course cr=(Course) it.next();
			System.out.println("课程："+cr.id +":"+cr.name);
		}
	}
	
	/**
	 * 通过foreach方法，取得实例
	 * @param args
	 */
	public void teseForeach() {
		System.out.println("有如下课程待选(通过foreach返回)：");
		for(Object obj:coursesToSelect) {
			Course cr=(Course) obj;
			System.out.println("课程："+cr.id +":"+cr.name);
		}
	}
	
	/**
	 * 修改List中的元素
	 * @param args
	 */
	public void testModify() {
		coursesToSelect.set(4, new Course("7","毛概"));
	}
	
	/**
	 * 删除List中的元素
	 * @param args
	 */
	public void tetRemove() {
		//Course cr=(Course) coursesToSelect.get(4);
		//System.out.println("我是课程："+cr.id+":"+cr.name+",我即将被删除！");
		//coursesToSelect.remove(cr);
		//coursesToSelect.remove(4);
		Course[] courses= {(Course) coursesToSelect.get(4),(Course) coursesToSelect.get(5)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("删除课程成功！");
		teseForeach();
	}
	
	public static void main(String[] args) {
		ListTest It=new ListTest();
		It.testAdd();
		It.testGet();
		It.testIterator();
		It.teseForeach();
		It.testModify();
		It.teseForeach();
		It.tetRemove();
	}

}
