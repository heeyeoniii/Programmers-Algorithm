import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int board[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

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

		System.out.println(answer);
	}
}
