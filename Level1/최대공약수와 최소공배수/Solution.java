class Solution {
    public int[] solution(int n, int m) {
        
        int[] answer = new int[2];

		int min = Math.min(n, m);
		int max = Math.max(n, m);

		// 최대공약수
		for (int i = 1; i <= min; i++) {
			if (min % i == 0 && max % i == 0) {
				answer[0] = i;
			}
		}

		// 최소공배수
		for (int i = min; i <= max * min; i++) {
			if (i % min == 0 && i % max == 0) {
				answer[1] = i;
				break;
			}
		}
        
        return answer;
    }
}
