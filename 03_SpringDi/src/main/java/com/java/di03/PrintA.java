package com.java.di03;

import org.springframework.stereotype.Component;

@Component("print-A") //bean 의 id대신이다. 
public class PrintA implements Print {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print a 입니다.");
	}

}
