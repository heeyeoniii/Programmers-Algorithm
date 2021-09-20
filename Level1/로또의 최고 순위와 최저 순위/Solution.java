class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i] == 0) { // 0일 경우, count1 증가
                count1++;
                continue;
            }
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) { // 번호가 같을 경우, count2 증가
                    count2++;
                    break;
                }
            }
        }     
        
        answer[0] = rank(count1 + count2); // 최고 번호 순위
        answer[1] = rank(count2); // 최저 번호 순위(0인데 숫자가 일치하지 않을 경우)
        
        return answer;
    }
    
    public static int rank(int num) {
        switch(num) {
            case 6 : return 1; // 6개 일치 시 1등
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            default : return 6;
                
        }
    }
}
