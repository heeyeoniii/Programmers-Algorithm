class Solution {
    public String solution(String s) {
        String answer = "";
        
        if (s.length() % 2 == 0) {
		// 단어의 길이가 짝수일 경우
		answer += s.charAt((s.length() / 2) - 1);
		answer += s.charAt(s.length() / 2);
	} else {
		// 단어의 길이가 홀수일 경우
		answer += s.charAt(s.length() / 2);
	}
        
        return answer;
    }
}
