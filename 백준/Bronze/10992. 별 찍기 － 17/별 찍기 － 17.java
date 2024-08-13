import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < n - i; j++) {
                sb.append(" ");
            }
            if (i!=1) sb.append("*");
            for (int k = 0; k < (i-1)*2-1; k++) {
                sb.append(" ");
            }
            sb.append("*").append("\n");
        }
        for (int i = 0; i < 2 * n - 1; i++) {
            sb.append("*");
        }
        System.out.print(sb);
    }
}