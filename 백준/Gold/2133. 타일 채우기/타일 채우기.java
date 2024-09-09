import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

    static int[] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new int[31];
        dp[0] = 1;
        for (int i = 2; i <= n; i+=2) {
            dp[i] = dp[i-2]*3;
            for (int j = i-4;  j >= 0; j-=2) {
                dp[i] += dp[j]*2;
            }
        }
        System.out.print(dp[n]);
    }
}
