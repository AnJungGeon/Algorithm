import java.util.*;

class Solution {
    public int[] solution(long n) {
        String[] strArr = String.valueOf(n).split("");
        int[] result = new int[strArr.length];
        
        for(int i = 0 ;i<strArr.length;i++){
            result[i] = Integer.parseInt(strArr[strArr.length - 1 -i]);
        }
        
        
        
        return result;
    }
}