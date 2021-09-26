import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for (int m : moves) {
		for (int i = 0; i < board.length; i++) {
			
			if (board[i][m - 1] != 0) {
				// 값이 들어있다면
				
				if (stack.peek() == board[i][m - 1]) {
					// 값이 동일하다면 제거
					stack.pop();
					answer += 2;

				} else {
					// 스택에 값 넣기
					stack.push(board[i][m - 1]);
				}
					
				board[i][m - 1] = 0; // 처리 후 0으로 만들어 주기
				break;
            	}
            }
        }       
        return answer;
    }
}
