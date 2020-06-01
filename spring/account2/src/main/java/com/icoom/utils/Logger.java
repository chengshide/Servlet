package com.icoom.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ���ڼ�¼��־�Ĺ����࣬�����ṩ�˹����Ĵ���
 * @author �ľ�ؼ�¼�
 *
 */
@Component("logger")
@Aspect    //��ʾ��ǰ����һ��������
public class Logger {
	
	@Pointcut("execution(* com.icoom.service.impl.*.*(..))")
	private void pt1() {}

	/**
	 * ǰ��֪ͨ
	 */
//	@Before("pt1()")
	public void beforePrintLog() {
		System.out.println("Logger���е�beforePrintLog������ʼ��¼��־�ˡ�����");
	}
	
	/**
	 * ����֪ͨ
	 */
//	@AfterReturning("pt1()")
	public void afterReturningPrintLog() {
		System.out.println("Logger���е�agterReturningPrintLog������ʼ��¼��־�ˡ�����");
	}
	
	/**
	 * �쳣֪ͨ
	 */
//	@AfterThrowing("pt1()")
	public void afterThrowingPrintLog() {
		System.out.println("Logger���е�afterThrowingPrintLog������ʼ��¼��־�ˡ�����");
	}
	
	/**
	 * ����֪ͨ
	 */
//	@After("pt1()")
	public void afterPrintLog() {
		System.out.println("Logger���е�afterPrintLog������ʼ��¼��־�ˡ�����");
	}
	
	/**
	 * ����֪ͨ
	 */
	@Around("pt1()")
	public Object aroundPrintLog(ProceedingJoinPoint pjp) {
		Object rtValue = null;
		try {
			Object[] args = pjp.getArgs();  //�õ�����ִ������Ĳ���
			System.out.println("ǰ��֪ͨ��aroundPringtLog������ʼ");
			rtValue = pjp.proceed(args);  //��ȷ����ҵ��㷽��������㷽����
			System.out.println("����֪ͨ");
			return rtValue;
		}catch(Throwable t) {
			System.out.println("�쳣֪ͨ");
			throw new RuntimeException(t);
		}finally {
			System.out.println("����֪ͨ");
		}
	}
}
