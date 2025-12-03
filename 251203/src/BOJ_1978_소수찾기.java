import java.util.Scanner;

public class BOJ_1978_소수찾기 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int cnt = 0;

        for1:
        for (int i = 0; i < t; i++) {
            int num = scanner.nextInt();
            if (num == 1) continue;

            for (int j = 2; j < num; j++) {
                if (num % j == 0) continue for1;
            }
            cnt++;
        }
        System.out.println(cnt);
    }

}
