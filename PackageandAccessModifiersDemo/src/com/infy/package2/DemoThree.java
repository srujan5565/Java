package com.infy.package2;
import com.infy.package1.*;
public class DemoThree {
	public void checkAccessibility() {
		DemoOne demoOne=new DemoOne();
		// com.infy.package1.DemoOne demoOne=new com.infy.package1.DemoOne(); // If not imported
		demoOne.variableOne=1;
//		demoOne.variableTwo=1; // Cannot access as it is private
//		demoOne.variableThree=1; // Cannot access as it is default
	}
}
