package codingTest;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {

		String dartResult = "1S2D*3T";

		Stack<Integer> stack = new Stack<>();
		int answer = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i);

			if (c == 'S') {
				stack.add((int) Math.pow(stack.pop(), 1));
				continue;
			}

			if (c == 'D') {
				stack.add((int) Math.pow(stack.pop(), 2));
				continue;
			}

			if (c == 'T') {
				stack.add((int) Math.pow(stack.pop(), 3));
				continue;
			}

			if (c == '*') {
				int num = stack.pop();
				if (!stack.isEmpty()) {
					stack.add(stack.pop() * 2);
				}
				stack.add(num * 2);
				continue;
			}

			if (c == '#') {
				stack.add(stack.pop() * -1);
				continue;
			}

			if (c - '0' == 1 && dartResult.charAt(i + 1) == '0') {
				stack.add(10);
				i++;

			} else {
				stack.add(c - '0');
			}
		}

		for (int score : stack) {
			answer += score;
		}

		System.out.println(answer);

	}
}
