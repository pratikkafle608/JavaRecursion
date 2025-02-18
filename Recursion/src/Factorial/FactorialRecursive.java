package Factorial;

public class FactorialRecursive {
	public static void main(String[] args) {
		System.out.println(factorialNonRecursive(5));
		
	}
	
	public static int factorialNonRecursive(int number) {
		if(number<=1) {
			return 1;
			
		}
		int factorial=1;
		while(number!=0) {
			factorial *=number;
			number--;
		}
		return factorial;
		
	}

}
