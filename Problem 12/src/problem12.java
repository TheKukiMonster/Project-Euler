
public class problem12 {

	static int divCount = 0;
	
	public static void main(String main[]){
		
		problem12 problem12 = new problem12();
		
		long triNum = 1;
		long sum = 0;
		
		//Create triangle number
		
		while(true){
			divCount=0;
			for(int i = 1; i<=triNum; i++){
				sum+=i;
			}
			//System.out.print(sum + " | ");
			problem12.checkDivs(sum);
			triNum++;
			
			if(divCount>500){
				System.out.println(sum);
				break;
			}
			sum=0;
		}
		
	}
	
	private void checkDivs(long sum){
			
		for(long i = 1; i<=Math.sqrt(sum); i++){
			if(sum%i==0){
				divCount+=2;
			}
		}
		//System.out.println(divCount);
	return;	
	}
	
}
