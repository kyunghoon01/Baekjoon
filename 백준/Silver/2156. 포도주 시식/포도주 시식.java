import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

    static int[] dp, cost;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        cost = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            cost[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = cost[1];
        if (n > 1) {  // n이 1일 경우를 고려하여 dp[2] 초기화
            dp[2] = cost[1] + cost[2];
        }

        for (int i = 3; i <= n; i++) {  // i=3부터 시작하는 루프
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + cost[i], dp[i - 3] + cost[i - 1] + cost[i]));
        }

        System.out.print(dp[n]);
    }
}