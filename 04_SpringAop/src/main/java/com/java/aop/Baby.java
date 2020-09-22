package com.java.aop;

public class Baby implements Persion {

	@Override
	public void awake() {
		System.out.println("잠에서 꺤다.");
	}

	@Override
	public void work() {
		System.out.println("유치원 등교");
	}

	@Override
	public void sleep() {
		System.out.println("잠을 잔다.");
	}

}
