public class Solution {

	public static void main(String[] args) {

		String[] strings = { "sun", "bed", "car" };
		int n = 1;

		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				char c1 = s1.charAt(n);
				char c2 = s2.charAt(n);

				if (c1 == c2) {
					return s1.compareTo(s2);
				} else {
					return c1 - c2;
				}
			}

		});

		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}

	}
}
