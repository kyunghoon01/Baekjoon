import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            leftStack.push(s.charAt(i)+"");
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("P")) {
                leftStack.push(st.nextToken());
            }
            if (command.equals("L")) {
                if (!leftStack.isEmpty()) rightStack.push(leftStack.pop());
            }
            if (command.equals("D")) {
                if (!rightStack.isEmpty()) leftStack.push(rightStack.pop());
            }
            if (command.equals("B")) {
                if (!leftStack.isEmpty()) leftStack.pop();
            }
        }

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        System.out.print(sb);
    }
}