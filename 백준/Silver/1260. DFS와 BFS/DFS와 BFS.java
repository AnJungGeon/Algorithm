
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 정점의 개수
		int M = Integer.parseInt(st.nextToken()); // 간선의 개수
		int V = Integer.parseInt(st.nextToken()); // 시작 정점

		boolean[][] matrix = new boolean[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			matrix[a][b] = true;
			matrix[b][a] = true;
		}
		// DFS 구현
		boolean[] visitedDFS = new boolean[N + 1];
		StringBuilder dfsResult = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		stack.push(V);

		while (!stack.isEmpty()) {
			int check = stack.pop();
			if (!visitedDFS[check]) {
				visitedDFS[check] = true;
				dfsResult.append(check).append(" ");
                // 인접 정점을 큰 번호부터 스택에 넣어 작은 번호가 먼저 처리되도록 함
				for(int i = N ; i>=1;i--) {
					if(matrix[check][i] && !visitedDFS[i]) {
						stack.push(i);
					}
				}
			}
		}
		System.out.println(dfsResult.toString());
		
		//BFS
		boolean[] visitedBFS = new boolean[N + 1];
		StringBuilder bfsResult = new StringBuilder();
		Queue<Integer> que = new LinkedList<>();
		que.add(V);
		visitedBFS[V] = true;
		
		while(!que.isEmpty()) {
			int check = que.poll();
			bfsResult.append(check).append(" ");
			
			for(int i=1; i<=N;i++) {
				if(matrix[check][i] && !visitedBFS[i]) {
					que.add(i);
					visitedBFS[i] = true;
				}
			}
		}
		System.out.println(bfsResult.toString());
	}
}
