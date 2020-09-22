package com.java.di03;

import org.springframework.stereotype.Component;

@Component("print-B")
public class PrintB implements Print{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print b ¿‘¥œ¥Ÿ.");
		
	}

}
