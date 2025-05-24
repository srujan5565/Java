package com.infy.package1;

public class DemoTwo {
	public void checkAccessibility() {
		DemoOne demoOne=new DemoOne();
		demoOne.variableOne=1;
//		demoOne.variableTwo=1; //Not Accessible
		demoOne.variableThree=1;
	}
}
