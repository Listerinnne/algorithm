import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class PRGMS_181919_콜라츠_수열_만들기 {

    public int[] solution0(int n) {
        List<Integer> list = new ArrayList<>();

        for (; ; ) {
            list.add(n);
            if (n == 1) break;
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }

        int len = list.size();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public int[] solution1(int n) {
        List<Integer> list = new ArrayList<>();

        for(;;){
            list.add(n);
            if(n == 1) break;
            n = n%2 == 0 ? n/2 : 3*n+1;
        }

        return list.stream()
                .filter(Objects::nonNull)
                .mapToInt(i -> i)
                .toArray();
    }


}
