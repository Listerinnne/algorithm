public class PRGMS_181929_원소들의_곱과_합 {
    public int solution1(int[] num_list) {
        int mul = 1;    //곱
        int pow = 0;    //합의 제곱

        for(int a : num_list){
            mul *= a;
            pow += a;
        }

        return mul < pow*pow ? 1 : 0;
    }


}
