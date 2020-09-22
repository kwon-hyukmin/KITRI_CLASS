package com.java.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		
		//둘의 형이 다르기 때문에 생성자에서 Example.class으로 추가하여 형변환을 해줄 수 있다.
		Example ex = ctx.getBean("example", Example.class);
		ex.disp();
		
		
		Testing t = (Testing) ctx.getBean("testing");
		t.print();
		
		ctx.close();
		
	}
}
