package com.java.aop;

public class Mam implements Persion{

	@Override
	public void awake() {
		System.out.println("�Ͼ��.");
	}

	@Override
	public void work() {
		System.out.println("������ �Ѵ�.");
	}

	@Override
	public void sleep() {
		System.out.println("���� �ܴ�. mom");
	}

}
