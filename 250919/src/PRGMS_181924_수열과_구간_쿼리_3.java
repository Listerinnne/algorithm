public class PRGMS_181924_수열과_구간_쿼리_3 {

    public int[] solution0(int[] arr, int[][] queries) {
        int tmp = 0;

        for(int[] a : queries){
            tmp = arr[a[0]];
            arr[a[0]] = arr[a[1]];
            arr[a[1]] = tmp;

        }
        return arr;
    }
}
