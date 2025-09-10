import java.util.Map;
import java.util.function.BiFunction;

public class PRGMS_181933_flag에_따라_다른_값_반환하기 {

    public int solution(int a, int b, boolean flag) {
        Map<Boolean, BiFunction<Integer, Integer, Integer>> function = Map.of(
                true, (c, d) -> c + d,
                false, (c, d) -> c - d
        );
        return function.get(flag).apply(a, b);
    }
}
