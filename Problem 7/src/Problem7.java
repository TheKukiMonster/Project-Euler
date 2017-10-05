
public class Problem7 {

	static int count = 0;

	public static void main(String args[]){

		Problem7 problem7 = new Problem7();
		
		for(int i = 2; count <= 10001; i++){
			problem7.checkPrime(i);
		}
		
	}
	
	
	private void checkPrime(int number){
		
		for(int i = 2; i<=Math.sqrt(number); i++){
			if(number%i == 0){
				return;
			}
		}
		
		count++;
		System.out.println(number + " is the " + count + "th prime");
		
	}
}
