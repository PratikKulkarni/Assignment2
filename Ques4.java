package neebalgurukul.day2;

public class Ques4 {
	void solnQues4() {
		int f=0;
		System.out.print(f+" ");
		int num1,num2;
		num2=0;
		f=1;
		for(int i=0;i<9;i++) {
			num1=num2;
			num2=f;
			f=num1+num2;
			num1=num2;
			num2=f;
			f=num1+num2;
			System.out.print(f+" ");
			num1=num2;
			num2=f;
			f=num1+num2;
		}
		System.out.println();
	}
}
