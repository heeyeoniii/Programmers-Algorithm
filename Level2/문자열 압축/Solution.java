class Solution {
    public int solution(String s) {
        
        int answer = Integer.MAX_VALUE;

        if(s.length() == 1) {
            answer = 1;
        }
        
        for (int i = 1; i <= s.length() / 2; i++) {
			String pattern = s.substring(0, i);
			int count = 1;
			String result = "";

            
			for (int j = i; j <= s.length() - i; j += i) {
				if (pattern.equals(s.substring(j, j + i))) {
					count++;
				} else {
					if (count > 1) {
						result += count + "";
					}
					result += pattern;
					pattern = s.substring(j, j + i);
					count = 1;
				}
			}

			if (count > 1) {
				result += "" + count;
			}
			result += pattern;

			int div = s.length() % i;
			answer = Math.min(answer, result.length() + div);
		}

		return answer;
	}
}
