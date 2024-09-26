import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken(); 
            
            if (command.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                if (stack.empty()) sb.append(-1).append('\n');
                else sb.append(stack.pop()).append('\n');
            } else if (command.equals("size")) {
                sb.append(stack.size()).append('\n');
            } else if (command.equals("empty")) {
                sb.append(stack.empty() ? 1 : 0).append('\n');
            } else if (command.equals("top")) {
                if (stack.empty()) sb.append(-1).append('\n');
                else sb.append(stack.peek()).append('\n');
            }
        }
        System.out.print(sb);
    }
}