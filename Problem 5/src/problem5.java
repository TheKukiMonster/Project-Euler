
public class problem5 {

	public static void main(String args[]){
		
		int divisor = 20;
		int number = 20;
		int i;
		
		boolean found = false;
		
		while(found == false){
			for(i = 19; i >= 11 ; i--){
				
				if(number % i != 0){
					//System.out.println(number + " is not divisble by " + i);
					break;
				}
				
				if(i == 11 && number % divisor == 0){
					System.out.println("No remainders for 1-20 at " + number);
					found = true;
				}
			}
			number+=20;
			i = 20;
		}
	}
	
}
