
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N  = Integer.parseInt(br.readLine());// 지도 크기
		int[][] map = new int[N][N]; // 지도 저장 1: 집이 있는지, 업음 : 0
		int[] dx = {-1, 1, 0, 0};// -1 위로 이동, 1 아래로 이동
		int[] dy = {0, 0, -1, 1};//-1 왼쪽 이동, 1, 오른쪽 이동 dfs,bfs에서 많이 쓰는 패턴임
		boolean[][] visited = new boolean[N][N];
		
		
		for(int i=0;i<N;i++) {
			String line = br.readLine();
			for(int j=0;j<N;j++) {
				map[i][j] = Character.getNumericValue(line.charAt(j));
			}
		}
		
		//결과 저장
        List<Integer> results = new ArrayList<>();
		
        
        for(int i=0;i<N;i++) {
        		for(int j=0;j<N;j++) {
        			if(map[i][j] == 1 && !visited[i][j]) { //집이 존재하고 아직 방문하지 않음
        				int count = 0; //단지의 크기
        				
        				List<int[]> stack = new ArrayList<>();//2차원 격자에서 좌표를 저장
        				stack.add(new int[]{i,j});//시작 위치 스택에 추가
        				visited[i][j] = true;//시작 위치 방문 처리
        				
        				while(!stack.isEmpty()) {
        					int[] current = stack.remove(stack.size() -1 );//스택에서 현재 위치 꺼내기
        					int x = current[0];
        					int y = current[1];
        					count++;
        					//상하좌우 탐색
        					for (int k = 0; k < 4; k++) {
        						int nx = x + dx[k];
        						int ny = y + dy[k];
        						
        						if(nx >=0 && ny >= 0 && nx < N && ny < N) {
        							if(map[nx][ny] == 1 && !visited[nx][ny]) {
        								stack.add(new int[] {nx, ny});
        								visited[nx][ny] = true;
        							}
        						}
        					}
        				}
        				results.add(count);
        			}
        		}
        }
		
		Collections.sort(results);
		System.out.println(results.size());
		for(int c : results) {
			System.out.println(c);
		}
	}
}
