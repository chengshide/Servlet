package com.icoom.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icoom.service.IAccountService;

public class AopTest {

	public static void main(String[] args) {
		//获取容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//获取对象
		IAccountService as = (IAccountService)ac.getBean("accountService");
		//执行方法
		as.saveAccount();

	}

}
