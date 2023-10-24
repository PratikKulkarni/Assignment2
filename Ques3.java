package neebalgurukul.day2;

import java.util.Scanner;

public class Ques3 {
	void solnQues3() {
		int start,end,num1,num2,f;
		System.out.println("Please enter the lower bound and upper bound");
		Scanner sc=new Scanner(System.in);
		start=sc.nextInt();
		end=sc.nextInt();
		num1=0;
		num2=1;
		for(f=(num1+num2);f<start;) {
			num1=num2;
			num2=f;
			f=num1+num2;
			
		}
		for(;f<=end;) {
			System.out.print(f+" ");
			num1=num2;
			num2=f;
			f=num1+num2;
		}
		System.out.println();
	}
}
