import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    static BufferedReader br;
    static int[] dp;
    static char[] ch;
    static int MOD = 1_000_000;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        ch = br.readLine().toCharArray();

        if (ch[0] == '0') {
            System.out.print(0);
            return;
        } 
        
        dp = new int[ch.length+1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= ch.length; i++) {
            if (ch[i-1] != '0') dp[i] += dp[i-1]%MOD;

            int temp = ((ch[i - 2] - '0') * 10) + (ch[i - 1] - '0');
            if (temp >=10 && temp <= 26) dp[i] += dp[i-2]%MOD;
        }
        System.out.print(dp[ch.length]%MOD);
    }
}
