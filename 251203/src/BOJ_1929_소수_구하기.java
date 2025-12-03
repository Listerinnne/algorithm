import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1929_소수_구하기 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, m, n + 1, true);
        prime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = m; j <= n; j++) {
                if (j % i == 0 && j != i && prime[j]) {
                    prime[j] = false;
                }
            }
        }
        for (int i = m; i <= n; i++) {
            if (prime[i])
                System.out.println(i);
        }
    }
}
