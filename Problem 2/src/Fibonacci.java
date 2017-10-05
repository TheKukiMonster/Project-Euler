
public class Fibonacci {

	static int sum = 0;
	
	public static void main(String[] args) {
		
		Fibonacci Fibonacci = new Fibonacci();
		
		System.out.println("1");
		int current = Fibonacci.fibonacciRecursive(1, 2);
		
		System.out.println("\nSum is: " + sum);
	}
	
	public int fibonacciRecursive(int previous, int current){
		
		System.out.print(previous + ", ");
		
		if(previous % 2 == 0){
			sum = sum + previous;
		}
		
		if(current >= 4000000){
			return previous;
		}
		else{
			current = fibonacciRecursive(current, current+previous);
		}
		
		return current;
	}

}
