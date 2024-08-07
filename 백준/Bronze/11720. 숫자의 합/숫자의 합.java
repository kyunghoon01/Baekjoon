import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        for (byte value : br.readLine().getBytes()) {
            sum += (value - '0');
        }
        System.out.print(sum);
    }
}