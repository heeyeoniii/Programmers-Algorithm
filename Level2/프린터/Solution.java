import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < priorities.length; i++) {
			q.offer(priorities[i]);
		}
		int answer = 0;

		while (!q.isEmpty()) {

			for (int i = 0; i < priorities.length; i++) {
				if (priorities[i] == q.peek()) {
					q.poll();
					answer++;

					if (location == i) {
						q.clear();
						break;
					}
				}
			}
		}
        return answer;
	}
}
