package neebalgurukul.day2;

import java.util.Scanner;

public class Ques2 {
	void solnQues2() {
		double x,y;
		System.out.println("Please enter the coordinates of a point");
		Scanner sc=new Scanner(System.in);
		x=sc.nextDouble();
		y=sc.nextDouble();
		if((x==0) && (y==0)) {
			System.out.println("The point is on the origin");
		}
		else if(x==0) {
			System.out.println("The point is on the Y axis");
		}else if(y==0) {
			System.out.println("The point is on the X axis");
		}
		else if((x>0) && (y>0)) {
			System.out.println("The point is in the 1st Quadrant");
		}
		else if((x>0)) {
			System.out.println("The point is in the 4th Quadrant");
		}
		else if(y>0) {
			System.out.println("The point is in the 2nd Quadrant");
		}
		else {
			System.out.println("The point is in the 3rd Quadrant");
		}
	}
}
