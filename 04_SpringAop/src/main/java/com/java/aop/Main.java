package com.java.aop;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:com/java/aop/config.xml");
		
		Persion mam = ctx.getBean("mam", Persion.class);
		mam.awake();
		mam.work();
		mam.sleep();
		
		System.out.println("============");
		
		Persion papa = ctx.getBean("papa", Persion.class);
		papa.awake();
		papa.work();
		papa.sleep();
		
		System.out.println("============");
		Persion baby = ctx.getBean("baby", Persion.class);
		baby.awake();
		baby.work();
		baby.sleep();
		
	}
}
