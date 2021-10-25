class Solution {
    public boolean solution(int x) {
        
        String str = String.valueOf(x);

	int sum = 0;
	boolean answer = true;

	for (int i = 0; i < str.length(); i++) {
		sum += str.charAt(i) - '0';
	}

	if (x % sum != 0) {
		answer = false;
	}
        
        return answer;
    }
}
