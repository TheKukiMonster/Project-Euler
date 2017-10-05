
public class Problem6 {

	public static void main(String args[]){
		
	
	int number = 100;
	int sum = 0;
	int prodSum = 0;
	int sqSum = 0;
	
		for(int i = 1; i<= number; i++){
			prodSum = prodSum + i*i;
		}
		
		System.out.println(prodSum);
		
		for(int j = 1; j<= number; j++){
			sum = sum + j;
			
			if(j == 100){
				sqSum = sum*sum;
			}
		}
		
		System.out.println(sqSum);
		
		System.out.println(sqSum - prodSum);
	}
}