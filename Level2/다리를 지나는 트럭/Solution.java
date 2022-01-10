import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<>();
		int time = 0;
		int sum = 0;

		for (int i = 0; i < truck_weights.length; i++) {
			int tmp = truck_weights[i];

			while (true) {
				if (q.isEmpty()) {
					q.offer(tmp);
					sum += tmp;
					time++;
					break;

				} else if (q.size() == bridge_length) {
					sum -= q.poll();
					
				} else {
					if (q.size() <= bridge_length && sum + tmp <= weight) {
						q.offer(tmp);
						sum += tmp;
						time++;
						break;

					} else {
						q.offer(0);
						time++;
					}
				}
			}
		}
		return time + bridge_length;
	}
}
