import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine()); // 첫 번째 리스트 크기
            Set<Integer> d = new HashSet<>();
            
            // 첫 번째 리스트 입력
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                d.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine()); // 두 번째 리스트 크기

            // 두 번째 리스트 입력 및 탐색
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < M; i++) {
                int checkNum = Integer.parseInt(st.nextToken());
                if (d.contains(checkNum)) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
        }

        System.out.print(sb);
    }
}
