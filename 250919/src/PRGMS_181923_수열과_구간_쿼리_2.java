import java.util.Arrays;

public class PRGMS_181923_수열과_구간_쿼리_2 {

    public int[] solution(int[] arr, int[][] queries) {
        int len = queries.length;
        int cnt = 0;
        int[] result = new int[len];
        Arrays.fill(result, Integer.MAX_VALUE);

        for(int[] a : queries){
            int[] tmp = new int[a[1]+1];
            System.arraycopy(arr, a[0], tmp, 0, a[1]-a[0]+1);

            for(int b : tmp){
                if(b > a[2]){
                    result[cnt] = Math.min(b, result[cnt]);
                }
            }
            result[cnt] = result[cnt] == Integer.MAX_VALUE? -1 : result[cnt];
            cnt++;
        }
        return result;
    }

    public int[] solution0(int[] arr, int[][] queries) {
        int len = queries.length;
        int cnt = 0;
        int[] result = new int[len];
        Arrays.fill(result, -1);

        for(int[] a : queries){
            int[] tmp = new int[a[1]+1];
            System.arraycopy(arr, a[0], tmp, 0, a[1]-a[0]+1);
            Arrays.sort(tmp);

            for(int b : tmp){
                if(b > a[2]){
                    result[cnt] = b;
                    break;
                }
            }
            cnt++;
        }
        return result;
    }
}
