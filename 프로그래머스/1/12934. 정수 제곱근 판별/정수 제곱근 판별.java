class Solution {
    public long solution(long n) {
        long answer = 0;
        answer = (long)Math.sqrt(n);
        
        if(answer * answer == n){
            long sqrt = answer + 1;
            return sqrt * sqrt; 
        }else{
            return -1;
        }
        
    }
}