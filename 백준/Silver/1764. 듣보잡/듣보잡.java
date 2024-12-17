import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> noHear = new HashSet<>();
        
        List<String> strList = new ArrayList<String>();
        
        for(int i=0;i<N;i++){
            noHear.add(br.readLine());
        }
        for(int i=0;i<M;i++){
            String str = br.readLine();
            if(noHear.contains(str)){
                strList.add(str);
            }
        }
        br.close();
        Collections.sort(strList);
        System.out.println(strList.size());
        
        for(String s : strList){
            System.out.println(s);
        }
    }
}