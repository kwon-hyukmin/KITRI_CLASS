package com.java.di05;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("appCTX.xml");
		
		Message en = ctx.getBean("messageEn",Message.class);
		Message kr= ctx.getBean("messageKr",Message.class);
		en.sayHello("spring");
		kr.sayHello("¼Õ°æ¼ö");
		ctx.close();
	}
}
