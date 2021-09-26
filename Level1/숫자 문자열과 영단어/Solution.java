class Solution {
    public int solution(String s) {
	// 방법 1.
        s = s.replaceAll("zero", "0");
	s = s.replaceAll("one", "1");
	s = s.replaceAll("two", "2");
	s = s.replaceAll("three", "3");
	s = s.replaceAll("four", "4");
	s = s.replaceAll("five", "5");
	s = s.replaceAll("six", "6");
	s = s.replaceAll("seven", "7");
	s = s.replaceAll("eight", "8");
	s = s.replaceAll("nine", "9");  

	// 방법 2. 배열 사용
	String[] numArr = {"zero", "one", "two", "three", "four", "five",
		           "six", "seven", "eight", "nine"};

	for (int i = 0; i < numArr.length; i++) {
		s = s.replace(numArr[i], Integer.toString(i));
	}              
        int answer = Integer.parseInt(s);
        return answer;
    }
}
