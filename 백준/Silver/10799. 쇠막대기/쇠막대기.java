import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String s = br.readLine();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') stack.push('(');
            else if (s.charAt(i-1) == ')' && c == ')'){
                stack.pop();
                result ++;
            }
            else {
                stack.pop();
                result += stack.size();
            };
        }
        System.out.print(result);
    }
}