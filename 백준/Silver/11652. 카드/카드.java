import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 첫 번째 입력은 숫자 개수

        Map<Long, Integer> cards = new HashMap<>();

        int max = 0;
        long maxIdx = 0;

        for (int i = 0; i < n; i++) {
            long card = Long.parseLong(br.readLine());
            cards.put(card, cards.getOrDefault(card, 0) + 1);

            if (max < cards.get(card)) {
                max = cards.get(card);
                maxIdx = card;
            } else if (cards.get(card) == max) {
                maxIdx = Math.min(maxIdx, card);
            }
        }
        System.out.print(maxIdx);
    }
}