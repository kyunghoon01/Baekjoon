import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int n = Integer.parseInt(br.readLine());
        while(n>0) {
            str = br.readLine();
            int a = str.charAt(0) - 48;
            int b = str.charAt(2) - 48;
            sb.append(a+b).append('\n');
            n--;
        }

        System.out.print(sb);
    }
}