import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6588_골드바흐의_추측 {

    public static final int MAX = 1000000;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] prime = new boolean[MAX + 1];

        for (int i = 2; i <= MAX; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= MAX; i++) {                // 소수 구하기
            if (prime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    if (!prime[j]) continue;
                    prime[j] = false;
                }
            }
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            boolean end = false;

            for (int i = 2; i <= n / 2; i++) {
                if (prime[i] && prime[n - i]) {                    // prime의 인덱스가 소수일 경우
                    System.out.println(sb.append(n).append(" = ").append(i).append(" + ").append(n - i).toString());
                    sb.delete(0, sb.length());
                    end = true;
                    break;
                }
            }
            if (!end)
                System.out.println("Goldbach's conjecture is wrong.");
        }
    }
}



