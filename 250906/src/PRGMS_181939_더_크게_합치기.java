public class PRGMS_181939_더_크게_합치기 {
        public int solution(int a, int b) {

            int case1 = Integer.parseInt(""+a+b);
            int case2 = Integer.parseInt(""+b+a);

            return case1 > case2 ? case1 : case2 ;
        }
}
