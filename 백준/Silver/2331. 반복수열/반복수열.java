import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer> list = new ArrayList<>();  // 수열을 저장하는 리스트
    static int k;  // 현재 값
    static int n;  // 제곱의 차수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        list.add(k);  // 리스트에 시작 값 추가

        while (true) {
            k = nextValue(k);  // 다음 값을 계산

            // 이미 리스트에 포함되어 있으면 반복 발생
            if (list.contains(k)) {
                // 반복 이전의 수들의 개수 출력
                System.out.print(list.indexOf(k));
                return;
            } else {
                list.add(k);  // 리스트에 값 추가
            }
        }
    }

    // 각 자리 숫자를 n 제곱하여 합을 구하는 메소드
    private static int nextValue(int k) {
        String str = k + "";
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += (int) Math.pow(Integer.parseInt(c + ""), n);
        }
        return sum;
    }
}