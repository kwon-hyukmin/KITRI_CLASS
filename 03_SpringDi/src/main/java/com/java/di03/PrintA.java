package com.java.di03;

import org.springframework.stereotype.Component;

@Component("print-A") //bean �� id����̴�. 
public class PrintA implements Print {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print a �Դϴ�.");
	}

}
