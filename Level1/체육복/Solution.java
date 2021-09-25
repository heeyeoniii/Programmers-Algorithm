import java.util.Arrays;

class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0; // 체육복을 빌린 학생 수

		Arrays.sort(lost);
		Arrays.sort(reserve);

		// 여벌 체육복이 있는 학생들이 도난당했을 경우
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1; // 빌려줄 수 없도록
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
				}
			}
		}

		return n - lost.length + answer;

	}
}
