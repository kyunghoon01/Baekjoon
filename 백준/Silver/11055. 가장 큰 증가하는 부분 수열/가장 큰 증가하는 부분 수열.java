import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    static int[] dp,map;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        map = new int[n+1];
        dp = new int[n+1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            map[i] = Integer.parseInt(st.nextToken());
            dp[i] = map[i];
        }

        int max = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (map[i] > map[j]) dp[i] = Math.max(dp[i], dp[j] + map[i]);
            }
            max = Math.max(dp[i], max);
        }
        System.out.print(max);
    }
}
