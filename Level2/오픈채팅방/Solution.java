import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


class Solution {
    public String[] solution(String[] record) {
        StringBuilder sb = new StringBuilder();

		HashMap<String, String> map = new HashMap<>();
		String originName = "";
		String changeName = "";

		for (int i = 0; i < record.length; i++) {
			String[] splitRecord = record[i].split("\\s+");

			for (int j = 0; j < splitRecord.length; j++) {

				switch (splitRecord[j]) {
				case "Enter":
					map.put(splitRecord[1], splitRecord[2]);
					sb.append(splitRecord[1] + "님이 들어왔습니다.-");
					break;

				case "Leave":
					sb.append(splitRecord[1] + "님이 나갔습니다.-");
					break;

				case "Change":
					originName = map.get(splitRecord[1]);
					changeName = splitRecord[2];
					map.replace(splitRecord[1], originName, changeName);
					break;

				}
			}
		}
		String str = sb.toString();
		String[] result = str.split("-");

		for (int k = 0; k < result.length; k++) {

			String key = result[k].substring(0, result[k].indexOf("님"));
			result[k] = result[k].replace(key, map.get(key));
		}
        
        return result;
	}
}
