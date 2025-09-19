public class PRGMS_181927_마지막_두_원소 {

    public int[] solution1(int[] num_list) {
        int len = num_list.length;
        int z = num_list[len-1];
        int y = num_list[len-2];
        int[] arr = new int[len+1];

        System.arraycopy(num_list, 0, arr, 0, len);

        if(z > y)
            arr[len] = z-y;
        else
            arr[len] = z*2;

        return arr;
    }
}
