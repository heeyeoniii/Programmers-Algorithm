import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			} else {
        // 첫 문자가 ')'라면 바로 false 리턴으로 효율성 테스트 통과
				if (stack.isEmpty()) {
					return false;
          
				} else {
					stack.pop();
				}
			}
		}
        
        if(!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}
