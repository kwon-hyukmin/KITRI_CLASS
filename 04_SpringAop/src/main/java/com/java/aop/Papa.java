package com.java.aop;

public class Papa implements Persion{

	@Override
	public void awake() {
		System.out.println("일어난다 papa");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("출근을 한다.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("잠을 잔다 papa");
	}

}
