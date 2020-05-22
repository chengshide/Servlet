package com.imooc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ͨ��Collections.sort()��������Integer���͵�List��������
 * ��String���͵�List��������
 * ���������ͷ��͵�List����������StudentΪ��
 * @author �ľ�ؼ�¼�
 *
 */
public class CollectionsTest {

	/**
	 * ͨ��Collections.sort()��������Integer���͵�List��������
	 * ����һ��Integer���͵�List������ʮ��100���ڵĲ��ظ����������
	 * ����Collections.sort()���������������
	 * @param args
	 */
	public void testSort1() {
		List<Integer> integerList=new ArrayList<Integer>();
		//����ʮ��100���ڵĲ��ظ��������
		Random random=new Random();
		Integer k;
		for(int i=0;i<10;i++) {
			do {
				k=random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("�ɹ����������"+k);
		}
		System.out.println("-----------����ǰ------------");
		for(Integer integer:integerList) {
			System.out.println("Ԫ�أ�"+integer);
		}
		Collections.sort(integerList);
		System.out.println("-----------�����------------");
		for(Integer integer:integerList) {
			System.out.println("Ԫ�أ�"+integer);
		}
	}
	
	/**
	 * ���������ͷ��͵�List����������StudentΪ��
	 * @param args
	 */
	public void testSort3() {
		List<Student> studentList=new ArrayList<Student>();
		Random random=new Random();
		studentList.add(new Student(30+"","Angela"));
		studentList.add(new Student(103+"","Mike"));
		studentList.add(new Student(2+"","Lucy"));
		System.out.println("--------����ǰ------------");
		for (Student student : studentList) {
			System.out.println("ѧ��"+student.id+":"+student.name);
		}
		Collections.sort(studentList);
		System.out.println("--------�����------------");
		for (Student student : studentList) {
			System.out.println("ѧ��"+student.id+":"+student.name);
		}
		System.out.println("----------�����������-------------");
		Collections.sort(studentList,new StudentComparator());
		for (Student student : studentList) {
			System.out.println("ѧ��"+student.id+":"+student.name);
		}
	}
	
	public static void main(String[] args) {
		CollectionsTest ct=new CollectionsTest();
//		ct.testSort1();
		ct.testSort3();
	}

}
