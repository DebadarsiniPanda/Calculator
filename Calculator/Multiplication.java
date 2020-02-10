package Calculator;

public class Multiplication extends Input implements Cal {

	public Multiplication() {
		super(num1, num2);
		inputnum();
		calculator();
	}
	
	public void calculator() {
		
		double res = num1*num2;
		System.out.println(num1+"*"+num2+"="+res);
		
	}	
}
