package com.java.aop;

public class Papa implements Persion{

	@Override
	public void awake() {
		System.out.println("�Ͼ�� papa");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("����� �Ѵ�.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("���� �ܴ� papa");
	}

}
