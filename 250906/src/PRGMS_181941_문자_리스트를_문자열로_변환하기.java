public class PRGMS_181941_문자_리스트를_문자열로_변환하기 {

    // 방법 1
        public static String solution1(String[] arr) {

            String result = "";

            for(String str : arr){
                result += str;
            }
            return result;
        }

    // 방법 2
    public static String solution2(String[] arr) {
        return String.join("", arr);
    }

}
