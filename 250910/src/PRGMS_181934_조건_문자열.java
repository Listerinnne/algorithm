public class PRGMS_181934_조건_문자열 {
    public int solution(String ineq, String eq, int n, int m) {

        if (eq.equals("=")) {
            if (n == m) return 1;
        }
        if (ineq.equals("<")) {
            return n < m ? 1 : 0;
        }
        return n > m ? 1 : 0;

    }
}
