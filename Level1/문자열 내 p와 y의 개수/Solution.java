public class Solution {

	public static void main(String[] args) {

		String s = "pPoooyY";

		int countP = 0, countY = 0;
		boolean answer = true;

		s = s.toUpperCase();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'P') {
				countP++;
			} else if (s.charAt(i) == 'Y') {
				countY++;
			}
		}

		if (countP != countY) {
			answer = false;
		}

		System.out.println(answer);

	}
}
