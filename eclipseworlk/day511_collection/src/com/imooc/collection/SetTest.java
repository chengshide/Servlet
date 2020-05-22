package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	
	public List<Course> coursesToSelect;
	
	private Scanner console;
	
	public SetTest() {
		coursesToSelect=new ArrayList<Course>();
		console=new Scanner(System.in);
	}

	/**
	 * ������coursesToSelect����ӱ�ѡ�γ�
	 */
	public void testAdd(){
		Course cr1=new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp=(Course)coursesToSelect.get(0);
		//System.out.println("����˿γ̣�"+temp.id+":"+temp.name);
		Course cr2=new Course("2","C����");
		coursesToSelect.add(0,cr2);
		Course temp2=(Course)coursesToSelect.get(0);
		//System.out.println("����˿γ̣�"+temp2.id+":"+temp2.name);
//		coursesToSelect.add(cr1);
//		Course temp0=(Course)coursesToSelect.get(2);
		//System.out.println("����˿γ̣�"+temp0.id+":"+temp0.name);
		
		Course[] course = {new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3=(Course) coursesToSelect.get(2);
		Course temp4=(Course) coursesToSelect.get(3);
//		System.out.println("��������ſγ̣�"+temp3.id+":"+temp3.name
//				+temp4.id+":"+temp4.name);
		Course[] course2 = {new Course("5","�ߵ���ѧ"),new Course("6","��ѧӢ��")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5=(Course) coursesToSelect.get(2);
		Course temp6=(Course) coursesToSelect.get(3);
//		System.out.println("��������ſγ̣�"+temp5.id+":"+temp5.name
//				+temp6.id+":"+temp6.name);
		
	}
	
	/**
	 * ͨ��foreach������ȡ��ʵ��
	 * @param args
	 */
	public void testForeach() {
		System.out.println("�����¿γ̴�ѡ(ͨ��foreach����)��");
		for(Object obj:coursesToSelect) {
			Course cr=(Course) obj;
			System.out.println("�γ̣�"+cr.id +":"+cr.name);
		}
	}
	
	/**
	 * ����List��contains����
	 * @param args
	 */
	public void testListContains() {
		System.out.println("������γ����ƣ�");
		String name=console.next();
		Course course2=new Course();
		course2.id="2";
		course2.name=name;
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+course2.name+","+
		coursesToSelect.contains(course2));
	}
	
	public static void main(String[] args) {
		SetTest st=new SetTest();
		st.testAdd();
		st.testListContains();
//		st.testForeach();
//		//����һ��ѧ������
//		Student student=new Student("1","С��");
//		System.out.println("��ӭѧ����"+student.name+"ѡ�Σ�");
//		//����һ��Scanner�����������մӼ�������Ŀγ�ID
//		Scanner console=new Scanner(System.in);
//		for(int i=0;i<3;i++) {
//			System.out.println("������γ�ID");
//			String courseId=console.next();
//			for(Course cr:st.coursesToSelect) {
//				if(cr.id.equals(courseId)) {
//					student.courses.add(cr);
//				}
//			}
//		}
//		st.testForEachForSet(student);
//		
	}
	public void testForEachForSet(Student student) {
		for(Course cr:student.courses) {
			System.out.println("ѡ���˿γ�"+cr.id+":"+cr.name);
		}
	}

}
