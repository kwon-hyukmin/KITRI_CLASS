package com.java.bank.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.java.bank.ui.BankUI;

public class MainClass {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		
		BankUI bankUi = ctx.getBean("BankView", BankUI.class);
		
		bankUi.execute();
		
		ctx.close();
	}

}
