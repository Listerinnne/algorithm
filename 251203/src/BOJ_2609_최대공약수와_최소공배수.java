import java.io.IOException;
import java.util.Scanner;

public class BOJ_2609_최대공약수와_최소공배수 {

    public static void main(String args[]) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcd = gcd(a, b);
        int lcm = a * b / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }

}
