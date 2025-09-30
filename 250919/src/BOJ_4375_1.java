import java.util.*;

public class BOJ_4375_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int n =  sc.nextInt();
            int base = 1;   // 1로만 이루어진 숫자
            int cnt = 1;    // 자릿수

            while((base = base%n) != 0){
                cnt++;
                base = base * 10 + 1;
            }
            System.out.println(cnt);
        }

    }

}
