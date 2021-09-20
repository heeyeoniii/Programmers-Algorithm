class Solution {
    public String solution(String new_id) {

        // 1. 소문자 치환
        new_id = new_id.toLowerCase(); 
        
        // 2. 문자 제거
        String id = "";
        for(int i=0; i<new_id.length(); i++) {
            char c = new_id.charAt(i);
            
            if(c >= 'a' && c <= 'z') {
                id += String.valueOf(c);
            } else if(c >= '0' && c <= '9') {
                id += String.valueOf(c);
            } else if(c == '_' || c == '-' || c == '.') {
                id += String.valueOf(c);
            }
        }
        
        // 3. ..를 .로 치환          
        while(id.contains("..")) {
            id = id.replace("..", ".");
        }
        
        // 4. .가 처음이나 끝에 위치하면 제거
        if(id.length() > 0) {
            if(id.charAt(0) == '.') {
                id = id.substring(1, id.length());
            }
            if(id.length() - 1 == '.') {
                id = id.substring(0, id.length() - 1);
            }
        }
        
        // 5. 빈 문자열이라면, 'a' 대입
        if(id.equals("")) {
            id = "a";
        }
        
        // 6. 16자 이상일 경우, 첫 15개 문자를 제외한 나머지 문자 제거
        if(id.length() >= 16) {
            id = id.substring(0, 15);
        }
        
        if(id.charAt(id.length() - 1) == '.') {
            id = id.substring(0, id.length()-1);
        }
        
        
        // 7. 길이가 2자 이하일 경우, 마지막 문자를 길이가 3이 될 때까지 붙이기
        if(id.length() <= 2) {
            char last = id.charAt(id.length() - 1);
            
            while(id.length() < 3) {
                id += String.valueOf(last);
            }
        }
        
        String answer = id;
        return answer;
    }
}
