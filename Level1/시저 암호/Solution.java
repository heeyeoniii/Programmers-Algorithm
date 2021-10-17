class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
		  char c = s.charAt(i);

		  if (Character.isLowerCase(c)) {
			  // 소문자라면
			  c = (char) ((c - 'a' + n) % 26 + 'a'); // 알파벳의 개수 : 26개

		  } else if (Character.isUpperCase(c)) {
			  // 대문자라면
			  c = (char) ((c - 'A' + n) % 26 + 'A');
		  }
		  answer += c;
	  } 
        return answer;
    }
}
