import java.util.ArrayList;
import java.util.List;

public class PRGMS_181920_카운트_업 {
    public int[] solution1(int start_num, int end_num) {
        int len = end_num - start_num + 1;
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i]+= start_num;
            start_num++;
        }
        return arr;
    }
    public int[] solution0(int start_num, int end_num) {
        List<Integer> list = new ArrayList<>();
        for(int i=start_num; i<=end_num; i++){
            list.add(i);
        }
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
