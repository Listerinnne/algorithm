import java.util.Scanner;
public class BOJ_1037_약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int tmp = 0;

        for(int i=0; i<cnt; i++){
            tmp = sc.nextInt();
            min = Math.min(min, tmp);
            max = Math.max(tmp, max);
        }
        System.out.println(min * max);
    }
}
