
public class problem15 {

	public static void main(String[] args) {
		
		int size = 21;
		
		long grid[][] = new long[size][size];
		
		for(int i = 0; i<size; i++){
			for(int j = 0; j<size; j++){
			 grid[i][j] = 1;
			}
		}
		for(int i = 1; i<size; i++){
			for(int j=1; j<size; j++){
				grid[i][j] = grid[i-1][j] + grid[i][j-1];
				System.out.println(grid[i][j] + " = " + grid[i-1][j] + " + " + grid[i][j-1]);
			}
		}
		
		System.out.println(grid[size-1][size-1]);
	}

}
