import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int arr[];
    static boolean check[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            int node = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr = new int[node + 1];
            check = new boolean[node + 1];

            for (int i = 1; i <= node; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            for (int i = 1; i <= node; i++) {
                if (!check[i]) {
                    dfs(i);
                    count++;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb);
    }

    private static void dfs(int start) {
        check[start] = true;
        int next = arr[start];
        if (!check[next]) dfs(next);
    }
}