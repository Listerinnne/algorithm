public class PRGMS_181928_이어_붙인_수 {

    public int solution2(int[] num_list) {
        int odd = 0, even = 0;

        for(int a : num_list){
            if(a%2 == 0){
                even *= 10;
                even += a;
            }else{
                odd *= 10;
                odd += a;
            }
        }
        return odd + even;
    }

    public int solution1(int[] num_list) {
        String odd = "";
        String even = "";

        for(int a : num_list){
            if(a%2 == 0)
                even += a;
            else
                odd += a;
        }
        return Integer.parseInt(even) + Integer.parseInt(odd);

    }

}
