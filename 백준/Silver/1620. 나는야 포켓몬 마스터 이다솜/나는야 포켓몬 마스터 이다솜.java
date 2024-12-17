import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        for(int i=1;i<=N;i++){
            String s = br.readLine();
            map1.put(i, s);
            map2.put(s, i);
        }
    
       for(int i =0;i<M;i++){
           String s = br.readLine();
           //입력받은 문자열이 숫자인지 아닌지를 확인한다. String.charAt(0)으로 문자열의 첫 인덱스 값을 확인한다. 
           if(49<=s.charAt(0) && s.charAt(0)<=57){
               sb.append(map1.get(Integer.parseInt(s))).append("\n");
           }else{
               sb.append(map2.get(s)).append("\n");
           }
       } 
        System.out.println(sb);
        br.close();
    }
} 