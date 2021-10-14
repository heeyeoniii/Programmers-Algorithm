import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] str = new char[s.length()];
	String answer = "";

	for (int i = 0; i < s.length(); i++) {
		str[i] = s.charAt(i);
	}

	Arrays.sort(str);

	for (int i = str.length - 1; i >= 0; i--) {
		answer += str[i];
	}
        
        return answer;
    }
}
