public class Solution {

	public static void main(String[] args) {

		int[][] scores = { { 50, 90 }, { 50, 87 } };

		String answer = "";
		char grade;

		for (int i = 0; i < scores.length; i++) {
			int sum = 0, max = 0, min = 100;
			double avg = 0;
			for (int j = 0; j < scores.length; j++) {

				if (i == j) continue;

				min = Math.min(min, scores[j][i]);
				max = Math.max(max, scores[j][i]);
				sum += scores[j][i];

				if (scores[i][i] > max || scores[i][i] < min) {
					avg = (double) sum / (scores.length - 1);
				} else {

					avg = (double) (sum + scores[i][i]) / scores.length;
				}

			}

			if (avg >= 90) {
				grade = 'A';
			} else if (avg >= 80 && avg < 90) {
				grade = 'B';
			} else if (avg >= 70 && avg < 80) {
				grade = 'C';
			} else if (avg >= 50 && avg < 70) {
				grade = 'D';
			} else {
				grade = 'F';
			}

			answer += grade;

		}
		System.out.println(answer);
	}
}
