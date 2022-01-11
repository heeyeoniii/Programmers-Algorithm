class Solution {
    
    public int solution(int n) {
        
    // Integer.toBinaryString() : 입력된 수를 2진수로 변환
		// Integer.bitCount() : 입력된 정수를 2진수로 변환한 뒤, 2진수에 포함된 1을 카운팅
		int count = Integer.bitCount(n);
		
		int count2 = 0;
		int answer = 0;
		
		while(true) {
			n++;
			
			count2 = Integer.bitCount(n);
			
			if(count == count2) {
				answer = n;
				break;
			}
		}
		return answer;
	}
}
