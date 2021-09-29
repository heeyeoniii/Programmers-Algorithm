class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
	int[] months = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
	int days = 0;

	for (int i = 0; i < a - 1; i++) {
		days += months[i];
	}

	days += b - 1;

	answer = day[days % 7];
      
        // DateFormat 클래스 사용
        /*
        Calendar cal = Calendar.getInstance();
		
	cal.set(2016, a-1, b);

	Date date = cal.getTime();
		
	SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);
		
	answer = sdf.format(date).toUpperCase();   
        */
        
        return answer;
    }
}
