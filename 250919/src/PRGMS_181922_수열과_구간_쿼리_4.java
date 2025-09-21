public class PRGMS_181922_수열과_구간_쿼리_4 {
    public int[] solution0(int[] arr, int[][] queries) {
        for(int[] query : queries){
            for(int j=query[0]; j<=query[1]; j++){
                if(j%query[2] == 0){
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}
