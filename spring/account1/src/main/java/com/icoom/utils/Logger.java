package com.icoom.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * ���ڼ�¼��־�Ĺ����࣬�����ṩ�˹����Ĵ���
 * @author �ľ�ؼ�¼�
 *
 */
public class Logger {

	/**
	 * ǰ��֪ͨ
	 */
	public void beforePrintLog() {
		System.out.println("Logger���е�beforePrintLog������ʼ��¼��־�ˡ�����");
	}
	
	/**
	 * ����֪ͨ
	 */
	public void afterReturningPrintLog() {
		System.out.println("Logger���е�agterReturningPrintLog������ʼ��¼��־�ˡ�����");
	}
	
	/**
	 * �쳣֪ͨ
	 */
	public void afterThrowingPrintLog() {
		System.out.println("Logger���е�afterThrowingPrintLog������ʼ��¼��־�ˡ�����");
	}
	
	/**
	 * ����֪ͨ
	 */
	public void afterPrintLog() {
		System.out.println("Logger���е�afterPrintLog������ʼ��¼��־�ˡ�����");
	}
	
	/**
	 * ����֪ͨ
	 */
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
