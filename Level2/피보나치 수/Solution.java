class Solution {
    public int solution(int n) {
        int result = 0;      
        int num = 1234567;
		int[] answer = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				answer[i] = 0;
			} else if (i == 1) {
				answer[i] = 1;
			} else {
				int sum = answer[i - 2] + answer[i - 1];
				answer[i] = sum % num;
			}
		}
        result = answer[n];
        
        return result;
    }
}
