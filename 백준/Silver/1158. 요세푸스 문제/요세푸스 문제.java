import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Deque<Integer> deq = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deq.addLast(i);
        }

        for (int j = 1; j < k; j++) {
            deq.addLast(deq.removeFirst());
        }
        sb.append(deq.removeFirst());

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < k; j++) {
                deq.addLast(deq.removeFirst());
            }
            sb.append(", ").append(deq.removeFirst());
        }
        System.out.print("<"+sb+">");
    }
}