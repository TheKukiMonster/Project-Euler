
public class problem14 {

	public static void main(String args[]){
		
		int highCount = 0;
		
		for(int i = 13; i < 1000000; i++){
			
			
			long j = i;
			int count = 0;
			
			while(j != 1){
				
//				System.out.println("Testing " + j);
				
				if(j%2==0){
					j/=2;
				}
				else{
					j=(3*j)+1;
				}
				
				count++;
			}
			 
			if(count >= highCount){
				highCount = count;
				System.out.println("Highest count at: " + i);
			}
		}
	
	}
}
