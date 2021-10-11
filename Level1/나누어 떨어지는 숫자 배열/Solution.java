public class Solution {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 6 };
		int divisor = 10;

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}

		if (list.isEmpty()) {
			list.add(-1);
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);

		}

		Arrays.sort(answer);

		for (int num : answer) {
			System.out.print(num + " ");
		}

	}
}
