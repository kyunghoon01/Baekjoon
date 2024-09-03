import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    static int[][] dp,cost;
    static int n,k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st0,st1;

        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            k = Integer.parseInt(br.readLine());
            cost = new int[2][k+1];
            dp = new int[2][k+1];
            st0 = new StringTokenizer(br.readLine());
            st1 = new StringTokenizer(br.readLine());

            for (int j = 1; j <= k; j++) {
                cost[0][j] = Integer.parseInt(st0.nextToken());
                cost[1][j] = Integer.parseInt(st1.nextToken());
            }

            dp[0][1] = cost[0][1];
            dp[1][1] = cost[1][1];

            for (int j = 2; j <= k; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + cost[0][j];
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + cost[1][j];
            }
            System.out.println(Math.max(dp[0][k], dp[1][k]));
        }
    }
}
