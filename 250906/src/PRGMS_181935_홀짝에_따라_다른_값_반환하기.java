public class PRGMS_181935_홀짝에_따라_다른_값_반환하기 {
    public int solution(int n) {

        if (n % 2 == 1) {
            // 홀수 합 공식 사용
            int num = (n + 1) / 2;
            return num * num;
            // for(int i=1; i<=n; i++){
            //     result += (i % 2 == 1) ? i : 0;
            // }
        } else {
            // 짝수 제곱의 합 공식 사용
            n /= 2;
            return ((n * (n + 1) * (2 * n + 1)) / 6) * 4;
            // for(int i=2; i<=n; i++){
            // result += (i % 2 == 0) ? Math.pow(i, 2) : 0;
            // }
        }

    }
}
