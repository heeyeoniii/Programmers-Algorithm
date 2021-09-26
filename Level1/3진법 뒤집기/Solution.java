class Solution {
    public int solution(int n) {
        int answer = 0;
        String num3 = "";
        
        while (n > 0) {
			    num3 += n % 3;
			    n = n / 3;
		}

		int count = 1;

		for (int i = num3.length() - 1; i >= 0; i--) {
			answer += (num3.charAt(i) - '0') * count;
			count *= 3;
		}       
        
        return answer;
    }
}
