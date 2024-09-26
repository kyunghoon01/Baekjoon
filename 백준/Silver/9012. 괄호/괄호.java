import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String input = br.readLine();  // 한 줄 전체 입력
            Stack<Character> stack = new Stack<>();  // 각 줄마다 스택 초기화
            boolean isValid = true;  // 괄호 유효성 체크

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);  // 한 문자씩 처리
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.empty()) {
                        isValid = false;  // 닫는 괄호가 남으면 유효하지 않음
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            // 괄호가 유효하고 스택이 비어 있으면 YES, 그렇지 않으면 NO
            if (isValid && stack.empty()) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }

        System.out.print(sb);
    }
}