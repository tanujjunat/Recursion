
public class Paths2DArray {
	int n=3,m=3;
	int count;
	public static void main(String[] args) {
		int grid [][] = {{1,1,1},
						{1,0,1},
						{1,1,1}}; 
		Paths2DArray obj = new Paths2DArray();
		obj.move(grid,0,0);
		System.out.println(obj.count);
	}

	private void move(int[][] grid, int i, int j) {
		
		if (i == n-1 && j == m-1) {
			count++;
		}
		if (i+1<n && grid[i+1][j] != 0) {
				move(grid,i+1,j);
		}
		if (j+1<m && grid[i][j+1] != 0) {
				move(grid,i,j+1);
		}
		
	}
}
