
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
        // 인접 리스트 생성
		List<List<Integer>> graph = new ArrayList<>();
		for(int i = 0 ;i<=n;i++) {
			graph.add(new ArrayList<>());
		}
		
        // 간선 입력
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        // 방문 배열 초기화
        boolean[] visited = new boolean[n + 1];
		int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                Stack<Integer> stack = new Stack<>();
                stack.push(i);

                while (!stack.isEmpty()) {
                    int node = stack.pop();
                    if (!visited[node]) {
                        visited[node] = true;
                        for (int c : graph.get(node)) {
                            if (!visited[c]) {
                                stack.push(c);
                            }
                        }
                    }
                }

                cnt++;
            }
        }

        System.out.println(cnt);
	}
}
