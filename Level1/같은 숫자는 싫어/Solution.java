public class Solution {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 3, 3, 0, 1, 1 };

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				list.add(arr[i]);
			}
		}

		list.add(arr[arr.length - 1]); // 마지막 인덱스의 값 추가

		int answer[] = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		for (int num : list) {
			System.out.println(num);
		}

	}
}
