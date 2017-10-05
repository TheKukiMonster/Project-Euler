import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class problem13 {

	public static void main(String args[]) throws FileNotFoundException{
		
		FileReader fr = new FileReader("Euler13.txt");
		Scanner scan = new Scanner(fr);
		
		String num[] = new String[100];
		long newNum = 0;
		
		for(int i=0; i<100; i++){
			num[i] = scan.nextLine();
			System.out.println(num[i]);
		}
		
		
		long sum = 0;
		for(int i=0; i<100; i++){
			sum = sum + Long.valueOf(num[i].substring(0, 17));
		}
		
		System.out.println((""+sum).substring(0,10));
		
		
		
	}
	
}
