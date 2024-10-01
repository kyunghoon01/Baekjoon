import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<ArrayList<Integer>> graph;  // 인접 리스트로 그래프 표현

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(br.readLine());

        while (k-- > 0) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st1.nextToken());  // 정점의 수
            int e = Integer.parseInt(st1.nextToken());  // 간선의 수

            graph = new ArrayList<>(v + 1);  // 정점 수 + 1만큼 리스트 초기화
            for (int i = 0; i <= v; i++) {
                graph.add(new ArrayList<>());  // 각 정점에 대한 리스트 초기화
            }

            // 간선 정보 입력
            for (int i = 0; i < e; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st2.nextToken());
                int b = Integer.parseInt(st2.nextToken());
                graph.get(a).add(b);  // a와 b 간의 연결
                graph.get(b).add(a);  // 양방향 간선
            }

            // 이분 그래프 확인 후 출력
            sb.append(isBipartiteGraph(v) ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }

    private static boolean isBipartiteGraph(int v) {
        int[] color = new int[v + 1];  // 각 정점의 색상을 저장하는 배열
        Queue<Integer> q = new LinkedList<>();  // 큐를 매번 초기화

        // 모든 정점에서 탐색 시도
        for (int i = 1; i <= v; i++) {
            if (color[i] == 0) {  // 방문하지 않은 정점만 탐색
                color[i] = 1;  // 시작점 색상 지정
                q.offer(i);  // 시작점을 큐에 삽입

                while (!q.isEmpty()) {
                    int curr = q.poll();  // 큐에서 현재 노드를 가져옴
                    for (int neighbor : graph.get(curr)) {  // 현재 노드에 연결된 모든 인접 노드 순회
                        if (color[neighbor] == 0) {  // 인접 노드가 아직 색상 지정되지 않았으면
                            color[neighbor] = color[curr] * -1;  // 인접 노드에 반대 색상 부여
                            q.offer(neighbor);  // 인접 노드를 큐에 추가
                        } else if (color[neighbor] == color[curr]) {  // 인접 노드가 현재 노드와 같은 색이면
                            return false;  // 이분 그래프가 아님
                        }
                    }
                }
            }
        }
        return true;  // 모든 노드가 이분 그래프 조건을 만족함
    }
}