package com.java.di01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Su su = new Su();
//		su.disp();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		
		//��������ȯ �ʿ� ctx��ü�� GenericXml
		Su su = (Su) ctx.getBean("su");
		su.disp();
		
		ctx.close();
	}

}