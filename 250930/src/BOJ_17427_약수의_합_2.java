import java.util.Scanner;

public class BOJ_17427_약수의_합_2 {
    public static void main(String[] args) {

        long a = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1;

        for (int i = 1; i <= n; i++) {
            int k = i;
            for (int j = 1; j < k; j++) {
                int tmp1 = i/j;
                int tmp2 = i % j == 0 ? j + (tmp1 = tmp1==j ? 0 : tmp1) : 0;
                sum += tmp2;
                k = tmp1;
            }
        }
        System.out.println(sum);

        long b = System.currentTimeMillis();
        System.out.println((b-a)/1000);
        }
    }
