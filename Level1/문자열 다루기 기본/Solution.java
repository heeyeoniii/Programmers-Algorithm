class Solution {
    public boolean solution(String s) {

	if(s.length() == 4 || s.length() == 6) {
            try {
                int x = Integer.parseInt(s); // 문자열을 정수로 변환, 에러 발생 경우 false 리턴
                return true;
		    
            } catch(NumberFormatException e) {
                return false;
            }
		
        } else {
            return false;
        }
    }
}
