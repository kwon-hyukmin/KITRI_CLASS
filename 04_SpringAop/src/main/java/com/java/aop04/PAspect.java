package com.java.aop04;

import org.aspectj.lang.ProceedingJoinPoint;

public class PAspect {

	public void sub(ProceedingJoinPoint joinpoint) {
		try {
		System.out.println("�����忡 ���´�.");
		
		//�ٽ��ڵ�
		//joinpoint.proceed();
		
		System.out.println("���ɽĻ縦 ��������");
		
		}catch(Throwable e) {
			System.out.println("�ı� ����!!! ������ ���´�.");
		}finally {
			System.out.println("���� �� !!! �������� ������.");
		}
	}
}
