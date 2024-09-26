import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // StringBuilder 초기화

        int number = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < number; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                int pushNumber = Integer.parseInt(st.nextToken());
                queue.add(pushNumber);
            } else if (command.equals("front")) {
                sb.append(queue.isEmpty() ? -1 : queue.peek()).append('\n');
            } else if (command.equals("back")) {
                sb.append(queue.isEmpty() ? -1 : ((LinkedList<Integer>) queue).getLast()).append('\n');
            } else if (command.equals("size")) {
                sb.append(queue.size()).append('\n');
            } else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append('\n');
            } else if (command.equals("pop")) {
                sb.append(queue.isEmpty() ? -1 : queue.poll()).append('\n');
            }
        }
        System.out.print(sb);
    }
}