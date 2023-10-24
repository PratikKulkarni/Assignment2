package neebalgurukul.day2;

import java.util.Scanner;

public class Ques5 {
	void solnQues5() {
		System.out.println("Please enter two numbers for calculating first no. to the power 2nd number");
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		long val;
		val=1;
		for(int i=1;i<=num2;i++) {
			val*=num1;
		}
		System.out.println("Output:"+val);
	}
}
