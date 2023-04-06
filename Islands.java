import java.io.*;
import java.lang.*;
import java.util.*;

class Islands {
	
	static final int ROW = 5, COL = 5;

	
	boolean isSafe(int M[][], int row, int col,
				boolean visited[][])
	{
		
		return (row >= 0) && (row < ROW) && (col >= 0)
			&& (col < COL)
			&& (M[row][col] == 1 && !visited[row][col]);
	}

	
	void DFS(int M[][], int row, int col, boolean visited[][])
	{
		
		// WRITE YOUR CODE HERE (~6 Lines)
			
		// END OF YOUR CODE HERE
	}

	
	int countIslands(int M[][])
	{
		// WRITE YOUR CODE HERE (~8 Lines)
			
		// END OF YOUR CODE HERE
	}

	
	public static void main(String[] args)
		throws java.lang.Exception
	{
		int M[][] = new int[][] {{ 1, 1, 0, 0, 0 },
								{ 0, 1, 0, 0, 1 },
								{ 1, 0, 0, 1, 1 },
								{ 0, 0, 0, 0, 0 },
								{ 1, 0, 1, 0, 1 } };
		Islands I = new Islands();
		System.out.println("Number of islands is: "
						+ I.countIslands(M));

		// OUTPUT: Number of islands is: 5
	}
} 
