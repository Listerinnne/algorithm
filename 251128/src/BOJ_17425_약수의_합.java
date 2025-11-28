

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_17425_약수의_합 {
    public static void main(String args[]) throws IOException{
        // 100만까지의 fx와 gx를 미리 구해놓은 다음
        // 문제에서 요구하는 대로 출력하는 것

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        final int MAX = 1000001;	// 0부터 시작하므로 인덱스 맞춰주기 위함
        long[] fx = new long[MAX];
        long[] gx = new long[MAX];
        Arrays.fill(fx, 1); 	//1은 모두의 약수이므로 미리 채워둠

        for(int i=2; i<MAX; i++) {
            for(int j=1; i*j<MAX; j++) {
                fx[i*j] += i;
            }
        }

        for(int i=1; i<MAX; i++) {
            gx[i] = gx[i-1] + fx[i];
        }

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            sb.append(gx[Integer.parseInt(br.readLine())] + "\n");
        }
        System.out.println(sb);

    }
}