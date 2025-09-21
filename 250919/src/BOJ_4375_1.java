import java.util.Scanner;
import java.lang.Math;

public class BOJ_4375_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = (int)Math.log10(num) + 1;   //입력받은 수의 자릿수
        long drainage = 1;   //1로만 이루어진 수

        // n보다 크거나 같은, 최소한의 1로만 이루어진 수를 구함
        for(int i=1; i<digit; i++){
            drainage = drainage * 10 + 1;
        }
        // n의 배수 찾기
        for(;;){
            // 찾았을 경우
            if(drainage % num == 0) break;
            // 못 찾았을 경우
            drainage = drainage * 10 + 1;
            digit++;
        }
        System.out.println(digit);
    }

}
