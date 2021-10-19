import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        
        Integer[] arr = new Integer[str.length()];

	for (int i = 0; i < str.length(); i++) {
		arr[i] = str.charAt(i) - '0';
	}

	Arrays.sort(arr, Collections.reverseOrder());

	for (int i = 0; i < arr.length; i++) {
		answer += arr[i] * Math.pow(10, arr.length - 1 - i);
	}
        
        return answer;
    }
}
