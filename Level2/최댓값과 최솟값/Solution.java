class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("\\s");

		    int max = Integer.MIN_VALUE;
	    	int min = Integer.MAX_VALUE;

		    for (String str : arr) {
			      int num = Integer.valueOf(str);

			      if (num > max) {
				      max = num;
			      }

			      if (num < min) {
				      min = num;
			      }
		      }     
        answer = min + " " + max;     
        return answer;
    }
}
