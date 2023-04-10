import java.io.*;
import java.lang.*;
import java.util.*;

class Islands {

    static final int ROW = 5, COL = 5;

    boolean isSafe(int M[][], int row, int col, boolean visited[][]) {
        return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][col] == 1 && !visited[row][col]);
    }

    void DFS(int M[][], int row, int col, boolean visited[][]) {
        int rowNbr[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int colNbr[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
        
        visited[row][col] = true;

        for (int k = 0; k < 8; ++k) {
            int newRow = row + rowNbr[k];
            int newCol = col + colNbr[k];
            if (isSafe(M, newRow, newCol, visited)) {
                DFS(M, newRow, newCol, visited);
            }
        }
    }

    int countIslands(int M[][]) {
        boolean visited[][] = new boolean[ROW][COL];
        int count = 0;
        
        for (int i = 0; i < ROW; ++i) {
            for (int j = 0; j < COL; ++j) {
                if (M[i][j] == 1 && !visited[i][j]) {
                    DFS(M, i, j, visited);
                    count++;
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) throws java.lang.Exception {
        int M[][] = new int[][] { 
            { 1, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 1 },
            { 1, 0, 0, 1, 1 },
            { 0, 0, 0, 0, 0 },
            { 1, 0, 1, 0, 1 } 
        };
        
        Islands I = new Islands();
        System.out.println("Number of islands is: " + I.countIslands(M));
        
        // OUTPUT: Number of islands is: 5
    }
}
