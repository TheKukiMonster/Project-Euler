import java.util.Stack;

public class Problem_3 {
	static Stack Divisors = new Stack();
	static Stack primeFactors = new Stack();
	public static void main(String args[]){
		Problem_3 problem3 = new Problem_3();
		long target = 600851475143L;
		problem3.findFactors(target);
		while(Divisors.isEmpty() != true){
			problem3.findFactors((Long)Divisors.pop());
		}
		while(primeFactors.isEmpty() != true){
			System.out.print(primeFactors.pop() + ", ");
		}
	}
	private void findFactors(long target){	
		boolean isPrime = false;
		for(long i = 2L; i <= target/2; i++){
			if(target % i == 0){
				Divisors.push(i);
				Divisors.push(target/i);
				isPrime = true;
				break;
			}
		}
		if(isPrime == false){
			primeFactors.push(target);
		}
	}
}
