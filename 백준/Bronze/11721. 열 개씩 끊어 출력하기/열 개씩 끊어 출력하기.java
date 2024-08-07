import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        char[] chars;
        int a =0;

        for (int i = 0; i < str.length()/10; i++) {
            chars = new char[10];
            str.getChars(a,a+10,chars,0);
            sb.append(chars).append('\n');
            a+=10;
        }

        if (str.length()%10>0) {
            chars = new char[str.length()%10];
            str.getChars(a,a+str.length()%10,chars,0);
            sb.append(chars).append('\n');
        }
        System.out.print(sb);
    }
}