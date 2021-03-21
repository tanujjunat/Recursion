import java.util.PriorityQueue;

public class MeltBallsMinimumCost {

	public static void main(String[] args) {
		int count;
		int balls [] = {4,3,2,6};
		count = minimumCost(balls,0);
		System.out.println(count);
	}

	private static int minimumCost(int[] balls,int i) {
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		int res=0;
		for (int k : balls) {
			pQ.add(k);
		}
		while (pQ.size() > 1) {
			int first = pQ.poll();
			int second = pQ.poll();
			res += first+second;
			pQ.add(first+second);
		}
		return res;

	}
}
