package com.java.aop;

public class Baby implements Persion {

	@Override
	public void awake() {
		System.out.println("�ῡ�� �ʴ�.");
	}

	@Override
	public void work() {
		System.out.println("��ġ�� �");
	}

	@Override
	public void sleep() {
		System.out.println("���� �ܴ�.");
	}

}
