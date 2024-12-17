import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<Integer>();
        int num = 0;
        
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            
            switch(str){
                case "push" : 
                    num = Integer.parseInt(st.nextToken());
                    que.offer(num);
                    break;
                case "pop"  :
                    if(que.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(que.poll()).append("\n");
                    }
                    break;
               case "size" :
				    sb.append(que.size()).append("\n");
				break;
		    	case "empty" :
			    	if(que.isEmpty()) sb.append(1).append("\n");
			    	else sb.append(0).append("\n");
			    	break;
		    	case "front" :
				    if(que.isEmpty()) sb.append(-1).append("\n");
				    else sb.append(que.peek()).append("\n");
			    	break;
		    	case "back" :
			    	if(que.isEmpty()) sb.append(-1).append("\n");
				    else sb.append(num).append("\n");
			    	break;
			    }
	    	}
		    System.out.println(sb);
	
            }
         
    
}