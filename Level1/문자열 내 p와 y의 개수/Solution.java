class Solution {
    boolean solution(String s) {
        
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

		if(countP != countY) {
			answer = false;
		}

        return answer;
    }
}
