package Calculator;

import java.util.Scanner;

class Input {
	
	static double num1;
	static double num2;
	
	static Scanner sc = new Scanner(System.in);

	Input(double num1, double num2) {
		
		this.num1=num1;
		this.num2=num2;
		
	}
	
	static void inputnum()
	{
		System.out.println("Enter 1st number");
		num1=sc.nextDouble();
		System.out.println("Enter 2nd number");
		num2=sc.nextDouble();
		
	}
	
	
	

}
