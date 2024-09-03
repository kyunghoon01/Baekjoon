import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    static int[] ldp,rdp,map;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        map = new int[n+1];
        ldp = new int[n+1];
        rdp = new int[n+1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            map[i] = Integer.parseInt(st.nextToken());
            ldp[i] = 1;
            rdp[i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (map[i] > map[j]) ldp[i] = Math.max(ldp[i], ldp[j] + 1);
            }
        }

        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--) {
                if (map[i] > map[j]) rdp[i] = Math.max(rdp[i], rdp[j] + 1);
            }
        }

        int max = 1;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, ldp[i] + rdp[i]);
        }
        System.out.print(max-1);
    }
}
