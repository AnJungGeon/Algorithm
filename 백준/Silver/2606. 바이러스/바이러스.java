import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{		
		Queue<Integer> que = new LinkedList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int node = Integer.parseInt(br.readLine());
		int line = Integer.parseInt(br.readLine());
		int[][] arr = new int[node+1][node+1];
		boolean[] check = new boolean[node+1];		
		for(int i=0;i<line;i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			arr[a][b] = arr[b][a] =1; // 무방향 그래프
		}
		int count = 0; // 감염된 컴퓨터 수
        que.add(1); // 시작 정점(컴퓨터 1) 추가
        check[1] = true; // 시작 정점 방문 처리

        // BFS 탐색
        while (!que.isEmpty()) {
            int current = que.poll(); // 큐에서 하나의 정점을 꺼냄
            count++; // 감염된 컴퓨터 수 증가

            for (int i = 1; i <= node; i++) {
                // 연결되어 있고, 아직 방문하지 않은 노드 탐색
                if (arr[current][i] == 1 && !check[i]) {
                    que.add(i); // 큐에 추가
                    check[i] = true; // 방문 처리
                }
            }
        }

        // 결과 출력
        System.out.println(count - 1);		
			
		
	}
}
