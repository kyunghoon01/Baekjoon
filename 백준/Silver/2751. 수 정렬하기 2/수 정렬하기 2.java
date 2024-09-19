import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

    static BufferedReader br;
    static StringBuilder sb;
    static boolean[] arr;
    static int N;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new boolean[2_000_001];

        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1_000_000] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                sb.append(i - 1_000_000).append('\n');
            }
        }

        System.out.println(sb);
    }
}
