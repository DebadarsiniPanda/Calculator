package Calculator;

public class Subtraction extends Input implements Cal {

	public Subtraction() {
		super(num1, num2);
		inputnum();
		calculator();
	}
	
	public void calculator() {
		
		double res = num1-num2;
		System.out.println(num1+"-"+num2+"="+res);
		
	}	
}
