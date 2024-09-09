import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

    static BufferedReader br;
    static long[] dp = new long[101];
    static int N;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        padovan();
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            sb.append(dp[Integer.parseInt(br.readLine())]).append('\n');
        }
        System.out.print(sb);
    }

    public static void padovan() {

        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;

        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i-3] + dp[i-2];
        }
    }
}
