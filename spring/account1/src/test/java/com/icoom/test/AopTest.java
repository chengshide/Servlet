package com.icoom.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icoom.service.IAccountService;

public class AopTest {

	public static void main(String[] args) {
		//��ȡ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//��ȡ����
		IAccountService as = (IAccountService)ac.getBean("accountService");
		//ִ�з���
		as.saveAccount();

	}

}
