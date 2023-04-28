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
    public int CheapestFLight(int n, int flights[][], int src, int dst, int K) {
        Map<Integer, List<Pair>> graph = new HashMap<>();
        for (int[] flight : flights) {
            graph.putIfAbsent(flight[0], new ArrayList<>());
            graph.get(flight[0]).add(new Pair(flight[1], flight[2]));
        }

        PriorityQueue<Tuple> pq = new PriorityQueue<>((a, b) -> a.third - b.third);
        pq.offer(new Tuple(src, 0, 0));

        while (!pq.isEmpty()) {
            Tuple curr = pq.poll();
            int city = curr.first;
            int stops = curr.second;
            int cost = curr.third;

            if (city == dst) {
                return cost;
            }

            if (stops <= K) {
                List<Pair> neighbors = graph.getOrDefault(city, new ArrayList<>());
                for (Pair neighbor : neighbors) {
                    pq.offer(new Tuple(neighbor.first, stops + 1, cost + neighbor.second));
                }
            }
        }

        return -1;
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
