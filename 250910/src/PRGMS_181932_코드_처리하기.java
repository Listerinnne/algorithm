import java.lang.StringBuilder;

public class PRGMS_181932_코드_처리하기 {

    public String solution3(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char tmp = code.charAt(i);

            if (tmp == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            if (i % 2 == mode)
                ret.append(tmp);

        }
        return ret.length() != 0 ? ret.toString() : "EMPTY";
    }

    /// ////////////////////////////////////////////////////////////////////////////////////

    public String solution2(String code) {
        StringBuilder ret = new StringBuilder();
        boolean mode = true;

        for (int i = 0; i < code.length(); i++) {
            String tmp = "" + code.charAt(i);

            if (tmp.equals("1")) {
                mode = !mode;
                continue;
            }
            if (mode && i % 2 == 0 || !mode && i % 2 == 1)
                ret.append(tmp);

        }
        String result = ret.toString();
        return !result.isEmpty() ? result : "EMPTY";
    }

    /// ////////////////////////////////////////////////////////////////////////////////////

    public String solution1(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {

            String tmp = "" + code.charAt(i);

            if (mode == 0) {
                if (!tmp.equals("1")) {
                    if (i % 2 == 0)
                        ret.append(tmp);
                } else {
                    mode = 1;
                    continue;
                }
            } else if (mode == 1) {
                if (!tmp.equals("1")) {
                    if (i % 2 != 0)
                        ret.append(tmp);
                } else {
                    mode = 0;
                }
            }
        }
        String result = ret.toString();
        return !result.equals("") ? result : "EMPTY";
    }



}

