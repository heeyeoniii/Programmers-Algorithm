import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
      	// 배열 정렬
	Arrays.sort(participant);
	Arrays.sort(completion);

	HashMap<String, Integer> map = new HashMap<>();

	for (String p : participant) {
		// key : 참가자 p
		// value : +1
		map.put(p, map.getOrDefault(p, 0) + 1);
	}

	for (String c : completion) {
		// 참가자 명단이 map에 존재하면, value : -1
		map.put(c, map.getOrDefault(c, 0) - 1);
	}

	for (String key : map.keySet()) {
		if (map.get(key) != 0) {
			answer += key;
			break;
		}
	}    
        return answer;
    }
}
