import java.util.*;

class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Tuple {
    int first, second, third; 
    Tuple(int first, int second, int third) {
        this.first = first; 
        this.second = second;
        this.third = third; 
    }
}
class Solution {
    public int CheapestFLight(int n,int flights[][],int src,int dst,int K) {

        // WRITE YOUR CODE HERE (~20 Lines)
			
		// END OF YOUR CODE HERE

        
    }
}

class tuf {

    public static void main(String[] args) {
       
        int n = 4, src = 0, dst = 3, K = 1;
        int[][] flights={{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};

        Solution obj = new Solution();
        int ans = obj.CheapestFLight(n,flights,src,dst,K);
        
        System.out.print(ans);
        System.out.println();

        // OUTPUT: 700
    }
}