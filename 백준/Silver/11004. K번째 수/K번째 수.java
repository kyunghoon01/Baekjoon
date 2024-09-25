import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        while (n-- > 0) {
            list.add(Integer.parseInt(st2.nextToken()));
        }

        Collections.sort(list);

        System.out.print(list.get(k-1));
    }
}