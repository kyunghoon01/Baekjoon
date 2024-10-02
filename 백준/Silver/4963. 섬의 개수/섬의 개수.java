import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
    static int[][] map;
    static boolean[][] check;
    static int cnt, h, w;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0)
                break;

            map = new int[h][w];
            check = new boolean[h][w];
            cnt = 0;  // 초기화 추가

            // 지도 정보 입력 받기
            for (int i = 0; i < h; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st1.nextToken());
                }
            }

            // 섬 탐색
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && !check[i][j]) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.print(sb);
    }

    private static void dfs(int x, int y) {
        check[x][y] = true;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            // 배열의 범위를 벗어나지 않는지 확인
            if (nx >= 0 && ny >= 0 && nx < h && ny < w && !check[nx][ny] && map[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}