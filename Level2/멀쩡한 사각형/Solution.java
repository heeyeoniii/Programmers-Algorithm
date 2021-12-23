class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        
        long x = w;
        long y = h;
        
        long min = Math.min(x, y);
		long max = Math.max(x, y);
        long g = 0;
        
        long area = x * y;
        
        for (int i = 1; i <= min; i++) {
			if (max % i == 0 && min % i == 0) {
				g = i;
			}
		}
        
        answer = area - (x + y - g);
        
        return (long)answer;
    }
}
