import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++) {
            str = br.readLine();
            int a = str.charAt(0) - 48;
            int b = str.charAt(2) - 48;
            sb.append("Case #"+i+": "+(a+b)).append('\n');
        }
        System.out.print(sb);
    }
}