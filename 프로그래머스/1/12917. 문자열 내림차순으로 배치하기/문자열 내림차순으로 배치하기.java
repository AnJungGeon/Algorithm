import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] list = s.toCharArray();
        Arrays.sort(list);
        StringBuilder sb = new StringBuilder(new String(list));
        
        answer = sb.reverse().toString();
        
        
        return answer;
    }
}