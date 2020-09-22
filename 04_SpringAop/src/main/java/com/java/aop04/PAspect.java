package com.java.aop04;

import org.aspectj.lang.ProceedingJoinPoint;

public class PAspect {

	public void sub(ProceedingJoinPoint joinpoint) {
		try {
		System.out.println("강의장에 들어온다.");
		
		//핵심코드
		//joinpoint.proceed();
		
		System.out.println("점심식사를 맛나게함");
		
		}catch(Throwable e) {
			System.out.println("식권 없음!!! 점심을 굶는다.");
		}finally {
			System.out.println("수업 끝 !!! 강의장을 나간다.");
		}
	}
}
