public class Calculator {
 
	public double add(double num1, double num2) {
		return num1+num2;
	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		double result = calculator.add(12.5,14.7);
		System.out.println(result);
		
	}

}