class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long realPrice = 0; // long으로 선언하지 않을 시 에러 발생
        int num = 1;
        
        for (int i = 0; i < count; i++) {
		realPrice += num * price;
		num++;
		continue;
	}
        
        answer = realPrice - money;
        if(money > realPrice) {
            answer = 0;
        }
        return answer;
    }
}
