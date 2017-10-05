
public class problem4 {

	public static void main(String args[]){
		
		problem4 problem4 = new problem4();
		
		int first = 999;
		int second = 999;
		
		while(first>0){
			while(second>0){
					second--;
					problem4.check(first*second);
			}
			
			second = 999;
			first--;
		}
		
	}
		
	private void check(int result){
		
		String product = Integer.toString(result);
		String palin = "";
		StringBuilder sb = new StringBuilder(palin);
		
		for(int i = product.length()-1; i >= 0; i--){
			sb.append(product.charAt(i));
		}
		
		if(sb.toString().matches(product) && Integer.valueOf(product)> 900000){
			System.out.println(palin + " | " + product);
		}
		
		
	}
	
}
