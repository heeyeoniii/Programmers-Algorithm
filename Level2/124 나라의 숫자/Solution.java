class Solution {
    public String solution(int n) {
        String[] numbers = { "4", "1", "2" };
		String answer = "";

		while (n > 0) {
			int left = n % 3;
			n /= 3;

			if (left == 0) n--;

			answer = numbers[left] + answer;
		}
        return answer;
	}
}
