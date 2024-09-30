import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static boolean[] check;
    static int[][] arr;
    static int node, line, result;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        for (int i = 1; i <= node; i++) {
            if (!check[i]) {
                bfs(i);
                result++;
            }
        }
        System.out.print(result);
    }

    private static void bfs(int start) {
        q.add(start);
        check[start] = true;
        while (!q.isEmpty()) {
            start = q.poll();
            for (int i = 1; i <= node; i++) {
                if (arr[start][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
}