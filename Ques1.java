package neebalgurukul.day2;

import java.util.Scanner;

public class Ques1 {
		void solnQues1() {
			double angleD,angleR,sum,val;
			int flag;
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter the value of the angle in degrees");
			angleD=sc.nextDouble();
			angleR=angleD*(Math.PI/180.0);
			//System.out.println(angleR);
			long fact;
			sum=1;
			flag=1;
			fact=(long)2;
			val=angleR*angleR;
			for(int i=1;i<10;i++) {
				if(flag==1) {
					sum+=((-1)*val/fact);
					flag=0;
					
				}
				else {
					sum+=(val/fact);
					flag=1;
					
				}
				fact=(fact*((long)(2*i+1))*((long)(2*i+2)));
				val=val*angleR*angleR;
			}
			System.out.println("Answer: "+sum);
		}
}
