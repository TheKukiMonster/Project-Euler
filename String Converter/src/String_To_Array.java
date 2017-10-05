import java.util.Scanner;

public class String_To_Array {

	public static void main(String args[]){
		
		//String_To_Array sta = new String_To_Array();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			String input = scanner.nextLine();
			String arrayString = input.replace(' ', ',');
			System.out.println(arrayString);
		}
	}
	
}
